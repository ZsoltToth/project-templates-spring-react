package hu.uni.eku.team3.dao;


import hu.uni.eku.team3.dao.entity.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest,String> {
    Guest findUsageById(Integer id);
}
