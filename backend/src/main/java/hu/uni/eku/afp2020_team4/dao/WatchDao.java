package hu.uni.eku.afp2020_team4.dao;

import hu.uni.eku.afp2020_team4.model.Watch;

import java.util.Collection;

public interface WatchDao {
    void create(Watch watch);

    Collection<Watch> fetchAll();

    void update(Watch oldWatch, Watch newWatch);

    void delete(Watch watchToDelete);
}
