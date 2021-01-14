package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.dao.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {
    CustomerEntity findByEmail(String email);
    boolean existsByEmail(String email);
}
