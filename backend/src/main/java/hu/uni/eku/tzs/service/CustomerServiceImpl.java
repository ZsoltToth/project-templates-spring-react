package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.dao.CustomerDao;
import hu.uni.eku.tzs.model.Customer;
import hu.uni.eku.tzs.service.exceptions.CustomerAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerDao dao;
    @Override
    public void record(Customer customer) throws CustomerAlreadyExistsException {
        final boolean isAlreadyRecorded = dao.readAll()
                .stream()
                .anyMatch(c ->
                        c.getId() == customer.getId()
                        &&
                                c.getName() == customer.getName()
                );
        if(isAlreadyRecorded){
            log.info("Customer {} is already recorded",customer);
            throw new CustomerAlreadyExistsException(String.format("Customer (%s) already exits!",customer.toString()));
        }
        dao.create(customer);
    }



    @Override
    public Collection<Customer>readAll(){
        return dao.readAll();
    }
}
