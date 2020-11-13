package hu.uni.eku.afp2020_team4.dao;

import hu.uni.eku.afp2020_team4.dao.entity.Slide;
import org.springframework.data.repository.CrudRepository;

public interface SlideRepository extends CrudRepository<Slide, Integer> {
    Slide findSlideById(Integer id);
}
