package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.CampingSlot;
import hu.uni.eku.tzs.model.Customer;
import hu.uni.eku.tzs.model.Reservation;
import hu.uni.eku.tzs.model.TryReservation;

import java.util.Collection;

public interface ReservationDao {

    void create(TryReservation tryReservation, CampingSlot campingSlot, Customer customer);

    public Collection<Reservation> readAll();

    Reservation readById(int id);

    void deleteById(int id);
}
