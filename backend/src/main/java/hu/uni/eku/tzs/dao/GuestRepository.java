package hu.uni.eku.tzs.dao;


import hu.uni.eku.tzs.model.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest,String> {
}
