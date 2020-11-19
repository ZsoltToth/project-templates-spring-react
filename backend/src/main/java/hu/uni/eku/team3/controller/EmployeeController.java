package hu.uni.eku.team3.controller;


import hu.uni.eku.team3.controller.dto.EmployeeDto;
import hu.uni.eku.team3.model.Employee;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.bridge.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(value = "/Employee")
@RequiredArgsConstructor
@Api(tags="Employee")
@Slf4j
public class EmployeeController{
    private Collection<EmployeeDto> employees =new ArrayList<>();

    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    @ApiOperation(value = "Get employee")
    public EmployeeDto fetchByuserData(@RequestBody Employee user){
        //Itt még nem biztos hogy jól kapja meg a user adatokat 
        for (EmployeeDto employee:employees){
            if(employee.getEmployeeEmail().equals(user.getEmployeeEmail())&&
                    employee.getPwd().equals(user.getPwd())){
                return EmployeeDto.builder()
                        .id(employee.getId())
                        .employeeEmail(employee.getEmployeeEmail())
                        .employeeName(employee.getEmployeeName())
                        .positionID(employee.getPositionID())
                        .build();
            }
        }
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"No user found");
    }
}