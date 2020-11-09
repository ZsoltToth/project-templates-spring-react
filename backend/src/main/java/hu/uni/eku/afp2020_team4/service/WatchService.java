package hu.uni.eku.afp2020_team4.service;

import hu.uni.eku.afp2020_team4.model.Watch;
import hu.uni.eku.afp2020_team4.service.exceptions.WatchAlreadyExistsException;
import hu.uni.eku.afp2020_team4.service.exceptions.WatchNotFoundException;

import java.util.Collection;

public interface WatchService {
    void create(Watch watchToCreate) throws WatchAlreadyExistsException;
    Collection<Watch> fetchAll();
    void update(String watchId, Watch newWatch) throws WatchNotFoundException;
    void delete(String watchId) throws WatchNotFoundException;
}
