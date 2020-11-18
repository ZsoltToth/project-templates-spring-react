package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.dao.entity.Position;
import org.springframework.data.repository.CrudRepository;

public interface PositionRepository extends CrudRepository<Position,String> {
    Position findUsageById(Integer id);
}
