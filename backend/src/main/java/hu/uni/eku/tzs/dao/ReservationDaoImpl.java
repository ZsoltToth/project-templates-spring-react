package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.dao.entity.ReservationEntity;
import hu.uni.eku.tzs.model.CampingSlot;
import hu.uni.eku.tzs.model.Customer;
import hu.uni.eku.tzs.model.Reservation;
import hu.uni.eku.tzs.model.TryReservation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class ReservationDaoImpl implements ReservationDao {

    private final ReservationRepository reservationRepository;

    private ReservationEntity reservation;


    public void create(TryReservation tryReservation, CampingSlot campingSlot, Customer customer) {
        reservation = ReservationEntityModelConverter.model2entity(tryReservation);
        reservation.setCustomer(CustomerDaoImpl.CustomerEntityModelConverter.model2entity(customer));
        reservation.setCampingSlot(CampingSlotDaoImpl.CampingSlotModelEntityConverter.model2Entity(campingSlot));
        reservationRepository.save(reservation);
    }

    public Collection<Reservation>readAll(){
        return StreamSupport.stream(reservationRepository.findAll().spliterator(),false)
                .map(entity -> ReservationEntityModelConverter.entity2model(entity)).collect(Collectors.toList());
    }

    public Reservation readById(int resId){
       return ReservationEntityModelConverter.entity2model(reservationRepository.findById(resId));
    }

    public void deleteById(int id){
        reservationRepository.deleteById(id);
    }

    private static class ReservationEntityModelConverter {
        private static Reservation entity2model(hu.uni.eku.tzs.dao.entity.ReservationEntity entity) {
            return new Reservation(
                    entity.getId(),
                    entity.getCampingSlot().getId(),
                    entity.getStart(),
                    entity.getEnd(),
                    entity.isElectricity(),
                    entity.isCaravan(),
                    entity.getCustomer().getEmail()
            );
        }

        private static hu.uni.eku.tzs.dao.entity.ReservationEntity model2entity(TryReservation reservation) {
            return hu.uni.eku.tzs.dao.entity.ReservationEntity.builder()
                    .start(reservation.getStart())
                    .end(reservation.getEnd())
                    .electricity(reservation.isElectricity())
                    .caravan(reservation.isCaravan())
                    .build();

        }
    }


}
