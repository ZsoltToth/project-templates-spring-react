package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.dao.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,String> {

}
