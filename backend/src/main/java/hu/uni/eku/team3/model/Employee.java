package hu.uni.eku.team3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private int id;
    private String employeeName;
    private String employeeEmail;
    private String pwd;
    private int positionID;
}