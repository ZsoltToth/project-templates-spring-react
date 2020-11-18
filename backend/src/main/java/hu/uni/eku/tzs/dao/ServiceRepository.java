package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Service;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<Service,String> {
}
