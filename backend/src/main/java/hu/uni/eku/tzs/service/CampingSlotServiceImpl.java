package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.dao.CampingSlotDao;
import hu.uni.eku.tzs.model.CampingSlot;
import hu.uni.eku.tzs.service.exceptions.CampingSlotAlreadyExistsException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;


@RequiredArgsConstructor
@Slf4j
@Service
public class CampingSlotServiceImpl implements CampingSlotService {

    private final CampingSlotDao dao;

    @Override
    public void record(CampingSlot campingSlot) throws CampingSlotAlreadyExistsException{
        final boolean isAlreadyRecorded =
                dao.readAll().stream().anyMatch(c ->
                                c.getId() == campingSlot.getId()
                        &&
                                c.getCoordinateX() == campingSlot.getCoordinateX()
                        &&
                                c.getCoordinateY() == campingSlot.getCoordinateY()

                        );
        if (isAlreadyRecorded){
            log.info("Camping Slot {} is already recorded",campingSlot);
            throw new CampingSlotAlreadyExistsException(String.format("Camping slot (%s) already exists! ",campingSlot.toString()));

        }
        dao.create(campingSlot);
    }
    @Override
    public Collection<CampingSlot>readAll(){
        return dao.readAll();
    }

    @Override
    public Collection<CampingSlot> readReserved(LocalDate start, LocalDate end) {

        return dao.readReserved(start, end);
    }
}
