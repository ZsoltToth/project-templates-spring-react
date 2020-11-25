package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.*;

import java.util.Collection;

public interface ReservationDao {

    void create(TryReservation tryReservation, CampingSlot campingSlot, Customer customer);

    Collection<Reservation> readAll();

    Reservation readById(int id);

    void deleteById(int id);

    Expenses queryExpenses(int id);

    boolean existsById(int id);
}
