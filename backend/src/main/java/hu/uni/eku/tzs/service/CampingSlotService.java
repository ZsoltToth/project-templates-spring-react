package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.model.CampingSlot;
import hu.uni.eku.tzs.service.exceptions.CampingSlotAlreadyExistsException;

import java.time.LocalDate;
import java.util.Collection;

public interface CampingSlotService {

    public void record(CampingSlot campingSlot) throws CampingSlotAlreadyExistsException;

    public Collection<CampingSlot>readAll();
    public Collection<CampingSlot> readReserved(LocalDate start, LocalDate end);
}
