package hu.uni.eku.team3.service;

import hu.uni.eku.team3.model.Employee;
import hu.uni.eku.team3.service.exceptions.*;

import java.util.Collection;

public interface EmployeeService {
    void create(Employee employeeCreate) throws EmployeeAlreadyExistsException;
    Collection<Employee> readAll();
    void update(Integer original, Employee updated) throws EmployeeNotFoundException;
    void delete(Integer employeeDelete) throws EmployeeNotFoundException;
}
