package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.dao.entity.Service;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<Service,String> {
    Service findUsageById(Integer id);
}
