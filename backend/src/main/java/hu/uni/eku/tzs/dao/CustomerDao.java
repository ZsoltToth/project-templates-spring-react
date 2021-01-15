package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.AddCustomer;
import hu.uni.eku.tzs.model.Customer;

import java.util.Collection;

public interface CustomerDao {

    void create(AddCustomer customer);

    Collection<Customer> readAll();

    Customer readByEmail(String email);

    boolean CustomerExists(String email);
}
