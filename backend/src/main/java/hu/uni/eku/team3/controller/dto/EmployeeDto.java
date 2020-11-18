package hu.uni.eku.team3.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {
    private int id;
    private String employeeName;
    private String employeeEmail;
    private String pwd;
    private int positionID;
}

