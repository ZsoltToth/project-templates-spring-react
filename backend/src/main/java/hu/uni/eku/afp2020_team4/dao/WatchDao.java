package hu.uni.eku.afp2020_team4.dao;

import hu.uni.eku.afp2020_team4.model.Watch;

import java.util.Collection;

public interface WatchDao {
    void create(Watch watchToCreate);

    Collection<Watch> fetchAll();

    void update(String watchId, Watch newWatch);

    void delete(String watchId);
}
