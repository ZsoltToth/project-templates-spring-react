package hu.uni.eku.tzs.controller;

import hu.uni.eku.tzs.controller.dto.CustomerDto;
import hu.uni.eku.tzs.controller.dto.ReservationDto;
import hu.uni.eku.tzs.controller.dto.ReservationRecordRequestDto;
import hu.uni.eku.tzs.model.Customer;
import hu.uni.eku.tzs.model.Reservation;
import hu.uni.eku.tzs.model.TryReservation;
import hu.uni.eku.tzs.service.CustomerService;
import hu.uni.eku.tzs.service.ReservationService;
import hu.uni.eku.tzs.service.exceptions.CampingSlotALreadyReservedException;
import hu.uni.eku.tzs.service.exceptions.CustomerNotExistsException;
import hu.uni.eku.tzs.service.exceptions.ReservationAlreadyExistsException;
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
                            ,request.getSlotId(),request.getStart(),request.getEnd(),request.isElectiricty(),request.isCaravan()
                            ));
        }catch (ReservationAlreadyExistsException exception) {
            log.info("Reservation:({},{}) already exists!",request.getStart(),request.getEnd());
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    exception.getMessage()
                    );

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
                        .build()
        ).collect(Collectors.toList());
    }



}
