package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.dao.CustomerDao;
import hu.uni.eku.tzs.model.AddCustomer;
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
    public void record(AddCustomer customer) throws CustomerAlreadyExistsException {
        final boolean isAlreadyRecorded = dao.CustomerExists(customer.getEmail());

        if(isAlreadyRecorded){
            log.info("Customer {} is already recorded",customer);
            throw new CustomerAlreadyExistsException(String.format("Customer (%s) already exits!",customer.toString()));
        }
        dao.create(customer);
    }

    public Customer readByEmail(String email){
        return dao.readByEmail(email);
    }

    @Override
    public Collection<Customer>readAll(){
        return dao.readAll();
    }
}
