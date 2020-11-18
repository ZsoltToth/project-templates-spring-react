package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Guest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class GuestDaoImpl implements GuestDao{
    private final GuestRepository repository;
    @Override
    public void create(Guest guestCreate) {
        repository.save(GuestEntityModleConverter.model2entity(guestCreate));
    }

    @Override
    public Collection<Guest> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(),false)
                .map(entity -> GuestEntityModleConverter.entity2model(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void update(Integer original, Guest updated) {
            hu.uni.eku.team3.dao.entity.Guest toUpdate =repository.findUsageById(original);
            toUpdate.setDepartureDate(updated.getDepartureDate());
            repository.save(toUpdate);
    }

    @Override
    public void delete(Integer guestDelete) {
        hu.uni.eku.team3.dao.entity.Guest result= repository.findUsageById(guestDelete);
        if(result!=null){
            repository.delete(result);
        }
    }
    private static class GuestEntityModleConverter{
        private static Guest entity2model(hu.uni.eku.team3.dao.entity.Guest entity){
            return new Guest(
                    entity.getIdentityNumber(),
                    entity.getName(),
                    entity.getDateOfBirth(),
                    entity.getArrivalDate(),
                    entity.getDepartureDate()
            );
        }
        private static hu.uni.eku.team3.dao.entity.Guest model2entity(Guest model){
            return hu.uni.eku.team3.dao.entity.Guest.builder()
                    .identityNumber(model.getIdentityNumber())
                    .name(model.getName())
                    .dateOfBirth(model.getDateOfBirth())
                    .arrivalDate(model.getArrivalDate())
                    .departureDate(model.getDepartureDate())
                    .build();
        }
    }
}
