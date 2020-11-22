package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.dao.entity.ReservationEntity;
import hu.uni.eku.tzs.model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<ReservationEntity,Integer> {
    ReservationEntity findById(int id);
}
