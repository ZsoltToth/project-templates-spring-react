package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.Customer;
import hu.uni.eku.tzs.model.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class ReservationDaoImpl implements ReservationDao {

    private final ReservationRepository reservationRepository;


    public void create(Reservation reservation){
        reservationRepository.save(ReservationEntityModelConverter.model2entity(reservation));
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
                    entity.getCustomerEmail(),
                    entity.getCustomerName(),
                    entity.getPhoneNumber(),
                    entity.getCustomerAddress(),
                    entity.getSlotId(),
                    entity.getStart(),
                    entity.getEnd()

            );
        }

        private static hu.uni.eku.tzs.dao.entity.ReservationEntity model2entity(Reservation reservation) {
            return hu.uni.eku.tzs.dao.entity.ReservationEntity.builder()
                    .id(reservation.getId())
                    .customerEmail(reservation.getCustomerEmail())
                    .customerName(reservation.getCustomerName())
                    .phoneNumber(reservation.getPhoneNumber())
                    .customerAddress(reservation.getCustomerAddress())
                    .slotId(reservation.getSlotId())
                    .start(reservation.getStart())
                    .end(reservation.getEnd())
                    .build();

        }
    }


}
