package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.dao.entity.Summary;
import org.springframework.data.repository.CrudRepository;

public interface SummaryRepository extends CrudRepository<Summary,String> {
    Summary findUsageById(Integer id);
}
