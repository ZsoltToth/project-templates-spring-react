package hu.uni.eku.tzs.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {
    private int employeeID;
    private String employeeName;
    private String employeeEmail;
    private String pwd;
    private int positionID;
}

