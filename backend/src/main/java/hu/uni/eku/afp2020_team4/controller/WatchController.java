package hu.uni.eku.afp2020_team4.controller;

import hu.uni.eku.afp2020_team4.controller.dto.WatchCreateRequestDto;
import hu.uni.eku.afp2020_team4.controller.dto.WatchDto;
import hu.uni.eku.afp2020_team4.dao.WatchDao;
import hu.uni.eku.afp2020_team4.model.Watch;
import hu.uni.eku.afp2020_team4.service.WatchService;
import hu.uni.eku.afp2020_team4.service.exceptions.WatchAlreadyExistsException;
import hu.uni.eku.afp2020_team4.service.exceptions.WatchNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.bridge.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/watch")
@RequiredArgsConstructor
@Api(tags = "Watch")
@Slf4j
public class WatchController {

    private final WatchService watchService;

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch all watch")
    public Collection<WatchDto> fetchAll() {
        return watchService.fetchAll().stream().map(watch ->
                WatchDto.builder()
                .watchId(watch.getWatchId())
                .build()
        ).collect(Collectors.toList());
    }

    @PostMapping(value = "/create")
    @ApiOperation(value = "Create a watch")
    public void create(@RequestBody WatchCreateRequestDto request) {
        try {
            watchService.create(new Watch(request.getWatchId()));
        } catch(WatchAlreadyExistsException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    @PutMapping(value = {"/{id}"})
    @ApiOperation(value = "Update a watch")
    public void update(@PathVariable String id, @RequestBody WatchCreateRequestDto request) {
        try {
            watchService.update(id, new Watch(request.getWatchId()));
        } catch(WatchNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    @DeleteMapping(value = {"/{id}"})
    @ApiOperation(value = "Delete a watch")
    public void delete(@PathVariable String id) {
        try {
            watchService.delete(id);
        } catch (WatchNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }
}
