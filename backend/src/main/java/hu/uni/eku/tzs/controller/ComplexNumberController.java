package hu.uni.eku.tzs.controller;

import hu.uni.eku.tzs.model.ComplexNumber;
import hu.uni.eku.tzs.service.ComplexNumberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/complex-number")
@RequiredArgsConstructor
@Api(tags = "Complex Numbers")
public class ComplexNumberController {

    private final ComplexNumberService service;

    @GetMapping("/record")
    public void record(
            @ApiParam(name = "real", required =  true, defaultValue = "0.0")
            @RequestParam(name = "real")
            double real,
            @ApiParam(name = "imag",  required = true, defaultValue = "0.0")
            @RequestParam(name = "imag")
            double imaginary
    ){
        service.record(new ComplexNumber(real,imaginary));
    }

}
