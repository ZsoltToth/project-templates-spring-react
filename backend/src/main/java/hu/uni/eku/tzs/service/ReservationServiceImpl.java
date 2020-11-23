package hu.uni.eku.tzs.service;


import hu.uni.eku.tzs.dao.CampingSlotDao;
import hu.uni.eku.tzs.dao.CustomerDao;
import hu.uni.eku.tzs.dao.ReservationDao;
import hu.uni.eku.tzs.model.*;
import hu.uni.eku.tzs.service.exceptions.CampingSlotALreadyReservedException;
import hu.uni.eku.tzs.service.exceptions.CustomerNotExistsException;
import hu.uni.eku.tzs.service.exceptions.ReservationAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
@Slf4j
public class ReservationServiceImpl implements ReservationService{

    private final CustomerDao customerDao;
    private final CampingSlotDao campingSlotDao;
    private final ReservationDao reservationDao;

    private Customer customerInfo;
    private CampingSlot campingslotInfo;



    public void record(TryReservation tryReservation) throws ReservationAlreadyExistsException, CampingSlotALreadyReservedException, CustomerNotExistsException {

        final boolean customerExists = customerDao.CustomerExists(tryReservation.getCustomerEmail());

        final boolean campingSlotAvailable = campingSlotDao.campingSlotAvailable(tryReservation.getSlotId());


        if(customerExists) {
            if (campingSlotAvailable){
                customerInfo = customerDao.readByEmail(tryReservation.getCustomerEmail());
                campingslotInfo = campingSlotDao.readById(tryReservation.getSlotId());
                campingslotInfo.setStatus(false);

                campingSlotDao.reserveCampingslot(campingslotInfo);

                reservationDao.create(new Reservation(tryReservation.getId(), tryReservation.getCustomerEmail(),
                        customerInfo.getName(), customerInfo.getPhoneNumber(), customerInfo.getAddress(),
                        tryReservation.getSlotId(), tryReservation.getStart(), tryReservation.getEnd()));
            }
            else{
                throw new CampingSlotALreadyReservedException();
            }
        }
        else{
            throw new CustomerNotExistsException();
        }
    }

    public Reservation readById(int id){
        return  reservationDao.readById(id);
    }

    public Collection<Reservation> readAll() {
        return reservationDao.readAll();
    }


}




