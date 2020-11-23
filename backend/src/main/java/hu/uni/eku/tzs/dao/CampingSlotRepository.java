package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.dao.entity.CampingSlotEntity;
import hu.uni.eku.tzs.model.CampingSlot;
import org.springframework.data.repository.CrudRepository;

public interface CampingSlotRepository extends CrudRepository<CampingSlotEntity,Integer> {
    boolean existsByIdAndAndStatusIsTrue(int id);
    CampingSlotEntity getById(int id);
}
