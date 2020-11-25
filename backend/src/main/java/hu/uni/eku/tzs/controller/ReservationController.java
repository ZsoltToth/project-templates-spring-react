package hu.uni.eku.tzs.controller;

import hu.uni.eku.tzs.controller.dto.BillDto;
import hu.uni.eku.tzs.controller.dto.ReservationDto;
import hu.uni.eku.tzs.controller.dto.ReservationRecordRequestDto;
import hu.uni.eku.tzs.model.*;
import hu.uni.eku.tzs.service.CustomerService;
import hu.uni.eku.tzs.service.ReservationService;
import hu.uni.eku.tzs.service.exceptions.CampingSlotALreadyReservedException;
import hu.uni.eku.tzs.service.exceptions.CustomerNotExistsException;
import hu.uni.eku.tzs.service.exceptions.ReservationNotExistsException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Api(tags = "Reservation")
@Slf4j
@RequestMapping ("/reservation")
public class ReservationController {

    private final ReservationService service;
    private final CustomerService customerService;

    @PostMapping("/record")
    @ApiOperation(value = "Record")
    public void record(@RequestBody ReservationRecordRequestDto request){
        log.info("Recording of Reservation ({})",request);
        try {
            service.record(new TryReservation(request.getCustomerEmail()
                            ,request.getSlotId(),request.getStart(),request.getEnd(),request.isElectricity(),request.isCaravan()
                            ));
        }catch (CustomerNotExistsException exception){
            log.info("Customer does not exists with this email:{}",request.getCustomerEmail());
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    exception.getMessage()
            );
        }catch (CampingSlotALreadyReservedException exception){
            log.info("This camping slot is already reserved:{}",request.getSlotId());
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    exception.getMessage()
            );
        }
    }

    @GetMapping("/{id}")
    @ResponseBody
    @ApiOperation(value = "Reservation query by id")
    public ReservationDto queryById(@PathVariable int id){
        Reservation reservation = service.readById(id);
        return ReservationDto.builder()
                        .id(reservation.getId())
                        .slotId(reservation.getSlotId())
                        .start(reservation.getStart())
                        .end(reservation.getEnd())
                        .electricity(reservation.isElectricity())
                        .caravan(reservation.isCaravan())
                        .customer(customerService.readByEmail(reservation.getCustomerEmail()))
                        .paid(reservation.isPaid())
                        .build();
    }

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "All Reservation query")
    public Collection<ReservationDto> queryAll() {
        return service.readAll().stream().map(reservation ->
                ReservationDto.builder()
                        .id(reservation.getId())
                        .slotId(reservation.getSlotId())
                        .start(reservation.getStart())
                        .end(reservation.getEnd())
                        .electricity(reservation.isElectricity())
                        .caravan(reservation.isCaravan())
                        .customer(customerService.readByEmail(reservation.getCustomerEmail()))
                        .paid(reservation.isPaid())
                        .build()
        ).collect(Collectors.toList());
    }

    @GetMapping("/expenses/{id}")
    @ResponseBody
    @ApiOperation(value = "Reservation expenses query by reservation id")
    public BillDto queryExpenses(@PathVariable int id) throws ReservationNotExistsException {
        try {
            Bill bill = service.queryExpenses(id);
            return BillDto.builder()
                    .reservationId(bill.getReservationId())
                    .campingSlotId(bill.getCampingSlotId())
                    .customerEmail(bill.getCustomerEmail())
                    .nights(bill.getNights())
                    .electricity(bill.isElectricity())
                    .caravan(bill.isCaravan())
                    .totalPrice(bill.getTotalPrice())
                    .build();
        }catch (ReservationNotExistsException exception){
            log.info("Reservation with this id:{} does not exists",id);
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    exception.getMessage()
            );
        }
    }
    @PutMapping("/pay/{id}")
    public void reservationPay(@ResponseBody ReservationPay reservationPay)

}
