package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.model.Reservation;
import hu.uni.eku.tzs.model.TryReservation;
import hu.uni.eku.tzs.service.exceptions.CampingSlotALreadyReservedException;
import hu.uni.eku.tzs.service.exceptions.CustomerNotExistsException;
import hu.uni.eku.tzs.service.exceptions.ReservationAlreadyExistsException;

public interface ReservationService {

    public void record(TryReservation tryReservation) throws CustomerNotExistsException, ReservationAlreadyExistsException, CampingSlotALreadyReservedException;

    Reservation readById(int id);
}
