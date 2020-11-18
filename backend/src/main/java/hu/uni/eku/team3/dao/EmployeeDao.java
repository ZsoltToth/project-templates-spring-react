package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Employee;

import java.util.Collection;

public interface EmployeeDao {
    void create(Employee employeeCreate);

    Collection<Employee> readAll();

    void update(Integer original, Employee updated);

    void delete(Integer employeeDelete);
}
