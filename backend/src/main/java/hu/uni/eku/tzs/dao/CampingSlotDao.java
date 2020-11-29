package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.CampingSlot;

import java.time.LocalDate;
import java.util.Collection;

public interface CampingSlotDao {

    void create(CampingSlot campingSlot);

    Collection<CampingSlot>readAll();

    boolean campingSlotAvailable(int id);

    CampingSlot readById(int id);

    void reserveCampingSlot(int id);

    void freeCampingSlot(int id);

    Collection<CampingSlot> readReserved(LocalDate start, LocalDate end);
}
