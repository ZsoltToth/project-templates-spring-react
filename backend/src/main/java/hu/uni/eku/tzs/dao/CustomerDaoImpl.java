package hu.uni.eku.tzs.dao;


import hu.uni.eku.tzs.model.Customer;
import hu.uni.eku.tzs.dao.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class CustomerDaoImpl implements CustomerDao{

    private final CustomerRepository customerRepository;

    @Override
    public void create(Customer customer){
        customerRepository.save(CustomerEntityModelConverter.model2entity(customer));
    }

    @Override
    public Collection<Customer> readAll(){
        return StreamSupport.stream(customerRepository.findAll().spliterator(),false)
                .map(entity -> CustomerEntityModelConverter.entity2model(entity))
                .collect(Collectors.toList());
    }

    @Override
    public Customer readByEmail(String email){
        return CustomerEntityModelConverter.entity2model(customerRepository.findByEmail(email));
    }

    @Override
    public boolean CustomerExists(String email){
        return customerRepository.existsByEmail(email);
    }

    public static class CustomerEntityModelConverter{
        public static Customer entity2model(hu.uni.eku.tzs.dao.entity.CustomerEntity entity){
            return new Customer(
                    entity.getName(),
                    entity.getAddress(),
                    entity.getPhoneNumber(),
                    entity.getEmail()
            );
        }

        public static hu.uni.eku.tzs.dao.entity.CustomerEntity model2entity(Customer customer){
            return hu.uni.eku.tzs.dao.entity.CustomerEntity.builder()
                    .name(customer.getName())
                    .address(customer.getAddress())
                    .phoneNumber(customer.getPhoneNumber())
                    .email(customer.getEmail())
                    .build();
        }
    }
}
