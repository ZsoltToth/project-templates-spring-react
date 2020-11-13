package hu.uni.eku.afp2020_team4.dao;

import hu.uni.eku.afp2020_team4.model.Slide;

import java.util.Collection;

public interface SlideDao {
    void create(Slide slide);
    Collection<Slide> fetchAll();
    void delete(Integer slideId);
}
