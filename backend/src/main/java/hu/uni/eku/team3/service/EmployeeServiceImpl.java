package hu.uni.eku.team3.service;

import hu.uni.eku.team3.dao.EmployeeDao;
import hu.uni.eku.team3.model.Employee;
import hu.uni.eku.team3.service.exceptions.EmployeeAlreadyExistsException;
import hu.uni.eku.team3.service.exceptions.EmployeeNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDao dao;
    @Override
    public void create(Employee employeeCreate) throws EmployeeAlreadyExistsException {
        final boolean alreadyExists =dao.readAll()
                .stream()
                .allMatch(sl -> sl.getId() == employeeCreate.getId());
        if (alreadyExists){
            throw new EmployeeAlreadyExistsException(String.format("Employee (%s) already exists",employeeCreate.toString()));
        }
        dao.create(employeeCreate);
    }

    @Override
    public Collection<Employee> readAll() {
        return dao.readAll();
    }

    @Override
    public void update(Integer original, Employee updated) throws EmployeeNotFoundException {

    }

    @Override
    public void delete(Integer employeeDelete) throws EmployeeNotFoundException {

    }
}
