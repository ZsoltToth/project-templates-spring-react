package hu.uni.eku.afp2020_team4.controller;

import hu.uni.eku.afp2020_team4.controller.dto.SlideCreateRequestDto;
import hu.uni.eku.afp2020_team4.controller.dto.SlideDto;
import hu.uni.eku.afp2020_team4.controller.dto.WatchDto;
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
    // ideiglenes tárolási hely
    private Collection<SlideDto> slides = new ArrayList<>();

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch all slide")
    public Collection<SlideDto> fetchAll() {
        return slides.stream().map(slide ->
                SlideDto.builder()
                        .slideId(slide.getSlideId())
                        .name(slide.getName())
                        .price(slide.getPrice())
                        .build()
        ).collect(Collectors.toList());
    }

    @GetMapping(value = {"/{id}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Fetch slide by ID")
    public SlideDto fetchById(@PathVariable String id) {
        for(SlideDto slide: slides) {
            if(slide.getSlideId().equals(id)) {
                return SlideDto.builder()
                        .slideId(slide.getSlideId())
                        .name(slide.getName())
                        .price(slide.getPrice())
                        .build();
            }
        }

        // később az üzenetet felváltja a serviceből kiváltódó exception üzenete!
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No slide found by the given ID!");
    }

    @PostMapping(value = {"/create"})
    @ApiOperation(value = "Create a slide")
    public void create(@RequestBody SlideCreateRequestDto request) {
        SlideDto newSlide = SlideDto.builder()
                                .slideId(UUID.randomUUID().toString())
                                .name(request.getName())
                                .price(request.getPrice())
                                .build();
        slides.add(newSlide);
    }

    @PutMapping(value = {"/{id}"})
    @ApiOperation(value = "Update a slide")
    public void update(@PathVariable String id, @RequestBody SlideCreateRequestDto request) {
        slides = slides.stream().map(
                slide -> slide.getSlideId().equals(id)
                        ? SlideDto.builder()
                            .slideId(slide.getSlideId())
                            .name(request.getName())
                            .price(request.getPrice())
                            .build()
                        : slide
        ).collect(Collectors.toList());
    }

    @DeleteMapping(value = {"/{id}"})
    @ApiOperation(value = "Delete a slide")
    public void delete(@PathVariable String id) {
        slides.removeIf(slide -> slide.getSlideId().equals(id));
    }
}
