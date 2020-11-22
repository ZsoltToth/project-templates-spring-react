package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Reservation;

import java.util.Collection;

public interface ReservationDao {

    public void create(Reservation reservation);

    public Collection<Reservation> readAll();

    Reservation readById(int id);
}
