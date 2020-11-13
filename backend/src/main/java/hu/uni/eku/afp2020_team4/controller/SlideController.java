package hu.uni.eku.afp2020_team4.controller;

import hu.uni.eku.afp2020_team4.controller.dto.SlideCreateRequestDto;
import hu.uni.eku.afp2020_team4.controller.dto.SlideDto;
import hu.uni.eku.afp2020_team4.controller.dto.WatchDto;
import hu.uni.eku.afp2020_team4.model.Slide;
import hu.uni.eku.afp2020_team4.service.SlideService;
import hu.uni.eku.afp2020_team4.service.exceptions.SlideAlreadyExistsException;
import hu.uni.eku.afp2020_team4.service.exceptions.SlideNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/slide")
@RequiredArgsConstructor
@Api(tags = "Slide")
public class SlideController {

    private final SlideService slideService;

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch all slide")
    public Collection<SlideDto> fetchAll() {
        return slideService.fetchAll().stream().map(slide ->
                SlideDto.builder()
                    .slideId(slide.getId())
                    .name(slide.getName())
                    .price(slide.getPrice())
                    .build()
        ).collect(Collectors.toList());
    }

    @PostMapping(value = {"/create"})
    @ApiOperation(value = "Create a slide")
    public void create(@RequestBody SlideCreateRequestDto request) {
        try {
            slideService.create(new Slide(request.getSlideId(), request.getName(), request.getPrice()));
        } catch (SlideAlreadyExistsException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }

    @DeleteMapping(value = {"/{id}"})
    @ApiOperation(value = "Delete a slide")
    public void delete(@PathVariable Integer id) {
        try {
            slideService.delete(id);
        } catch (SlideNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());
        }
    }
}
