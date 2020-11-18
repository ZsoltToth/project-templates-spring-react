package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Position;
import org.springframework.data.repository.CrudRepository;

public interface PositionRepository extends CrudRepository<Position,String> {
}
