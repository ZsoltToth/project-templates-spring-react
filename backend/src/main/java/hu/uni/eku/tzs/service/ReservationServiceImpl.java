package hu.uni.eku.tzs.service;


import hu.uni.eku.tzs.dao.CampingSlotDao;
import hu.uni.eku.tzs.dao.CustomerDao;
import hu.uni.eku.tzs.dao.ReservationDao;
import hu.uni.eku.tzs.model.CampingSlot;
import hu.uni.eku.tzs.model.Customer;
import hu.uni.eku.tzs.model.Reservation;
import hu.uni.eku.tzs.model.TryReservation;
import hu.uni.eku.tzs.service.exceptions.CampingSlotALreadyReservedException;
import hu.uni.eku.tzs.service.exceptions.CustomerNotExistsException;
import hu.uni.eku.tzs.service.exceptions.ReservationAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class ReservationServiceImpl implements ReservationService{

    private final CustomerDao customerDao;
    private final CampingSlotDao campingSlotDao;
    private final ReservationDao reservationDao;
    private Customer customerInfo;



    public void record(TryReservation tryReservation) throws ReservationAlreadyExistsException, CampingSlotALreadyReservedException, CustomerNotExistsException {

        final boolean customerExists = customerDao.CustomerExists(tryReservation.getCustomerEmail());



        final boolean SlotReserved = campingSlotDao.readAll().stream().anyMatch(campingSlot ->
                campingSlot.getId() == tryReservation.getSlotId()
                &&
                campingSlot.getStatus() == false //false = Reserved

            );
        final boolean isReservationExists = reservationDao.readAll().stream().anyMatch(reservation ->
                reservation.getCustomerEmail() == tryReservation.getCustomerEmail()
                &&
                        reservation.getStart() == tryReservation.getStart()
                &&
                        reservation.getEnd() == tryReservation.getEnd()
                );
        if(customerExists) {
            customerInfo = customerDao.readByEmail(tryReservation.getCustomerEmail());

            reservationDao.create(new Reservation(tryReservation.getId(), tryReservation.getCustomerEmail(),
                    customerInfo.getName(), customerInfo.getPhoneNumber(), customerInfo.getAddress(),
                    tryReservation.getSlotId(), tryReservation.getStart(), tryReservation.getEnd()));
        }
        else{
            throw new CustomerNotExistsException();

        }

    }

    public Reservation readById(int id){
        return  reservationDao.readById(id);
    }


}




