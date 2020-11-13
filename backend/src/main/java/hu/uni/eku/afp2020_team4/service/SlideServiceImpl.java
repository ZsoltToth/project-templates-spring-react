package hu.uni.eku.afp2020_team4.service;

import hu.uni.eku.afp2020_team4.dao.SlideDao;
import hu.uni.eku.afp2020_team4.model.Slide;
import hu.uni.eku.afp2020_team4.service.exceptions.SlideAlreadyExistsException;
import hu.uni.eku.afp2020_team4.service.exceptions.SlideNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
public class SlideServiceImpl implements SlideService {

    private final SlideDao dao;

    @Override
    public void create(Slide slide) throws SlideAlreadyExistsException {
        final boolean alreadyExists = dao.fetchAll()
                .stream()
                .anyMatch(sl -> sl.getId() == slide.getId());
        if(alreadyExists){
            throw new SlideAlreadyExistsException(String.format("Slide (%s) already exists!", slide.toString()));
        }

        dao.create(slide);
    }

    @Override
    public Collection<Slide> fetchAll() {
        return dao.fetchAll();
    }

    @Override
    public void delete(Integer slideId) throws SlideNotFoundException {
        dao.delete(slideId);
    }
}
