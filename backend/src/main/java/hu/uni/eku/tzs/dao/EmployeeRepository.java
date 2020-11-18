package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,String> {
}
