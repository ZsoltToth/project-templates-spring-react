package hu.uni.eku.tzs.controller;

import hu.uni.eku.tzs.model.ComplexNumber;
import hu.uni.eku.tzs.service.ComplexNumberService;
import hu.uni.eku.tzs.service.exceptions.ComplexNumberAlreadyExistsException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "/complex-number")
@RequiredArgsConstructor
@Api(tags = "Complex Numbers")
@Slf4j
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
        log.info("Recording of Complex Number ({},{})",real,imaginary);
        try {
            service.record(new ComplexNumber(real,imaginary));
        } catch (ComplexNumberAlreadyExistsException e) {
            log.info("Complex number ({},{}) is already exists!", real,imaginary);
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    e.getMessage()
            );
        }
    }

}
