package hu.uni.eku.tzs.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeRecordRequestDto {
    private int employeeID;
    private String employeeName;
    private String employeeEmail;
    private String pwd;
    private int positionID;
}
