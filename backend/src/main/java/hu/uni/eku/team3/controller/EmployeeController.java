package hu.uni.eku.team3.controller;


import hu.uni.eku.team3.model.Employee;
import hu.uni.eku.team3.service.EmployeeService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Optional;

@RestController
@RequestMapping(value = "/Employee")
@RequiredArgsConstructor
@Api(tags="Employee")
public class EmployeeController{
    private final EmployeeService employeeService;

}