package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Summary;
import org.springframework.data.repository.CrudRepository;

public interface SummaryRepository extends CrudRepository<Summary,String> {
}
