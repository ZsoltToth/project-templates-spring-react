package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.model.Bill;
import hu.uni.eku.tzs.model.Expenses;
import hu.uni.eku.tzs.model.Reservation;
import hu.uni.eku.tzs.model.TryReservation;
import hu.uni.eku.tzs.service.exceptions.CampingSlotALreadyReservedException;
import hu.uni.eku.tzs.service.exceptions.CustomerNotExistsException;
import hu.uni.eku.tzs.service.exceptions.ReservationAlreadyExistsException;
import hu.uni.eku.tzs.service.exceptions.ReservationNotExistsException;

import java.util.Collection;

public interface ReservationService {

    void record(TryReservation tryReservation) throws CustomerNotExistsException, CampingSlotALreadyReservedException;

    Reservation readById(int id);

    Collection<Reservation> readAll();

    Bill queryExpenses(int id) throws ReservationNotExistsException;
}
