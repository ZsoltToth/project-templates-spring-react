package hu.uni.eku.team3.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRecordRequestDto {
    private int id;
    private String employeeName;
    private String employeeEmail;
    private String pwd;
    private int positionID;
}
