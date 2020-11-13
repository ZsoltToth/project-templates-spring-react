package hu.uni.eku.afp2020_team4.service;

import hu.uni.eku.afp2020_team4.model.Slide;
import hu.uni.eku.afp2020_team4.service.exceptions.SlideAlreadyExistsException;
import hu.uni.eku.afp2020_team4.service.exceptions.SlideNotFoundException;

import java.util.Collection;

public interface SlideService {
    void create(Slide slide) throws SlideAlreadyExistsException;
    Collection<Slide> fetchAll();
    void delete(Integer slideId) throws SlideNotFoundException;
}
