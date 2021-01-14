package hu.uni.eku.tzs.controller;

import hu.uni.eku.tzs.controller.dto.CampingSlotDto;
import hu.uni.eku.tzs.controller.dto.CampingSlotRecordRequestDto;
import hu.uni.eku.tzs.model.CampingSlot;
import hu.uni.eku.tzs.service.CampingSlotService;
import hu.uni.eku.tzs.service.exceptions.CampingSlotAlreadyExistsException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/camping-slot")
@RequiredArgsConstructor
@Api(tags = "Camping Slot")
@Slf4j
public class CampingSlotController {

    private final CampingSlotService service;

    @PostMapping(value = "/record")
    public void record(@RequestBody CampingSlotRecordRequestDto request) {
        log.info("Recording of Camping Slot ({})", request.getId());
        try {
            service.record(new CampingSlot(request.getId(), request.getCoordinateX(),
                    request.getCoordinateY(), request.getPrice(), request.getStatus(),
                    request.getDescription()));
        } catch (CampingSlotAlreadyExistsException exception) {
            log.info("Camping Slot ({}) already exists. Message:{}", request.getId(), exception.getMessage());
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    exception.getMessage()
            );
        }
    }



    @GetMapping(value = {"/{from}&{to}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Query Camping Slot")
    public Collection<CampingSlotDto> query(@PathVariable String from, @PathVariable String to) {
        //Collection<CampingSlot> slots = service.readReserved(start, end);
        return service.readReserved(LocalDate.parse(from), LocalDate.parse(to)).stream().map(model ->
                CampingSlotDto.builder()
                        .id(model.getId())
                        .coordinateX(model.getCoordinateX())
                        .coordinateY(model.getCoordinateY())
                        .price(model.getPrice())
                        .status(model.getStatus())
                        .description(model.getDescription())
                        .build()
        ).collect(Collectors.toList());
    }

}
