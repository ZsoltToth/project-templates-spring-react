package hu.uni.eku.afp2020_team4.controller;

import hu.uni.eku.afp2020_team4.controller.dto.WatchCreateRequestDto;
import hu.uni.eku.afp2020_team4.controller.dto.WatchDto;
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

    // ideiglenesen itt tároljuk az órákat
    private Collection<WatchDto> watches = new ArrayList<>();

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch all watch")
    public Collection<WatchDto> fetchAll() {
        return watches.stream().map(watch ->
                WatchDto.builder()
                .watchId(watch.getWatchId())
                .build()
        ).collect(Collectors.toList());
    }

    @GetMapping(value = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch watch by ID")
    public WatchDto fetchById(@PathVariable String id) {
        for(WatchDto watch: watches) {
            if(watch.getWatchId().equals(id)) {
                return WatchDto.builder().watchId(watch.getWatchId()).build();
            }
        }

        // később az exception üzenete kiváltódik a serviceből kapott üzenettel
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No watch found by the given ID!");
    }

    @PostMapping(value = "/create")
    @ApiOperation(value = "Create a watch")
    public void create() {
        // egyelőre a fenti Collection-ben gyűjtjük az órákat
        // ezt később felváltja a service hívása
        WatchDto newWatch = WatchDto.builder()
                .watchId(UUID.randomUUID().toString())
                .build();
        watches.add(newWatch);
    }

    @DeleteMapping(value = {"/{id}"})
    @ApiOperation(value = "Delete a watch")
    public void delete(@PathVariable String id) {
        watches.removeIf(watch -> watch.getWatchId().equals(id));
    }
}
