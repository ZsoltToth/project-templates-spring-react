package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.dao.entity.CampingSlotEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.Collection;

public interface CampingSlotRepository extends CrudRepository<CampingSlotEntity,Integer> {
    boolean existsByIdAndStatusIsTrue(int id);
    CampingSlotEntity getById(int id);

   //@Query("SELECT DISTINCT c FROM ReservationEntity r JOIN r.campingSlot c")
   @Query(
           "SELECT c FROM CampingSlotEntity c WHERE c.id NOT IN " +
                   "(SELECT c.id FROM ReservationEntity r JOIN r.campingSlot c " +
                   "WHERE (r.start >= ?1 AND r.start <= ?2) OR (r.end >= ?1 AND r.end <= ?2) " +
                   "OR (r.start < ?1 AND r.end > ?2))"
   )
    Collection<CampingSlotEntity> getReserved(LocalDate start, LocalDate end);

}
