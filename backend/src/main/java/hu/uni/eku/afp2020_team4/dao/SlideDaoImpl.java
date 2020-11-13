package hu.uni.eku.afp2020_team4.dao;

import hu.uni.eku.afp2020_team4.model.Slide;
import hu.uni.eku.afp2020_team4.model.Watch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class SlideDaoImpl implements SlideDao {

    private final SlideRepository repository;

    @Override
    public void create(Slide slide) {
        repository.save(SlideEntityModelConverter.model2entity(slide));
    }

    @Override
    public Collection<Slide> fetchAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                        .map(entity -> SlideEntityModelConverter.entity2model(entity))
                        .collect(Collectors.toList());
    }

    @Override
    public void delete(Integer slideId) {
        hu.uni.eku.afp2020_team4.dao.entity.Slide result = repository.findSlideById(slideId);
        if(result != null)
            repository.delete(result);
    }

    private static class SlideEntityModelConverter {
        private static Slide entity2model(hu.uni.eku.afp2020_team4.dao.entity.Slide entity){
            return new Slide(entity.getId(), entity.getName(), entity.getPrice());
        }

        private static hu.uni.eku.afp2020_team4.dao.entity.Slide model2entity(Slide model) {
            return hu.uni.eku.afp2020_team4.dao.entity.Slide.builder()
                    .id(model.getId())
                    .name(model.getName())
                    .price(model.getPrice())
                    .build();
        }
    }
}
