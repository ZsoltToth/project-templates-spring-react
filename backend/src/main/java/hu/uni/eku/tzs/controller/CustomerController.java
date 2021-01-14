package hu.uni.eku.tzs.controller;

import hu.uni.eku.tzs.controller.dto.CustomerDto;
import hu.uni.eku.tzs.controller.dto.CustomerRecordRequestDto;
import hu.uni.eku.tzs.model.AddCustomer;
import hu.uni.eku.tzs.model.Customer;
import hu.uni.eku.tzs.service.CustomerService;
import hu.uni.eku.tzs.service.exceptions.CustomerAlreadyExistsException;
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
@RequestMapping(value = "/customer")
@RequiredArgsConstructor
@Api(tags = "Customer")
@Slf4j
public class CustomerController {

    private final CustomerService service;
    
    @PostMapping("/record")
    @ApiOperation(value = "Record")
    public void record(@RequestBody CustomerRecordRequestDto request){
        log.info("Recording of customer ({},{})",request.getEmail(),request.getName());
        try {
            service.record(new AddCustomer(request.getName(),
                    request.getAddress(),request.getPhoneNumber(),request.getEmail()));
        }catch (CustomerAlreadyExistsException exception){
            log.info("Customer ({},{}) is already exists! Message: {}",request.getEmail(),request.getName(),exception.getMessage());
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    exception.getMessage()
            );

        }
    }

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Query customer")
    public Collection<CustomerDto>query(){
        return service.readAll().stream().map(model ->
                CustomerDto.builder()
                        .name(model.getName())
                        .address(model.getAddress())
                        .phoneNumber(model.getPhoneNumber())
                        .email(model.getEmail())
                        .build()
        ).collect(Collectors.toList());
    }
}
