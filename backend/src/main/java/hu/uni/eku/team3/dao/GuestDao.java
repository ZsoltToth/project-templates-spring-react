package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Guest;

import java.util.Collection;

public interface GuestDao {
    void create(Guest guestCreate);

    Collection<Guest> readAll();

    void update(Integer original, Guest updated);

    void delete(Integer guestDelete);
}
