package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class EmployeeDaoImpl implements EmployeeDao {
    private final EmployeeRepository repository;

    @Override
    public void create(Employee employeeCreate) {
        repository.save(EmployeeEntityModleConverter.model2entity(employeeCreate));
    }

    @Override
    public Collection<Employee> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(entity -> EmployeeEntityModleConverter.entity2model(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void update(Integer original, Employee updated) {

    }

    @Override
    public void delete(Integer employeeDelete) {

    }
    private static class EmployeeEntityModleConverter{
        private static Employee entity2model(hu.uni.eku.team3.dao.entity.Employee entity){
            return new Employee(
                    entity.getId(),
                    entity.getEmployeeName(),
                    entity.getEmployeeEmail(),
                    entity.getPwd(),
                    entity.getPositionID()
            );
        }
        private static hu.uni.eku.team3.dao.entity.Employee model2entity(Employee model){
            return hu.uni.eku.team3.dao.entity.Employee.builder()
                    .id(model.getId())
                    .employeeName(model.getEmployeeName())
                    .employeeEmail(model.getEmployeeEmail())
                    .pwd(model.getPwd())
                    .positionID(model.getPositionID())
                    .build();
        }
    }
}
