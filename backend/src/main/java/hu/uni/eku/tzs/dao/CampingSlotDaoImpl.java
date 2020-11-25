package hu.uni.eku.tzs.dao;

import hu.uni.eku.tzs.model.CampingSlot;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import hu.uni.eku.tzs.dao.CampingSlotRepository;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class CampingSlotDaoImpl implements CampingSlotDao{

    private final CampingSlotRepository repository;

    @Override
    public void create(CampingSlot campingSlot) {
        repository.save(CampingSlotModelEntityConverter.model2Entity(campingSlot));
    }

    @Override
    public Collection<CampingSlot> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(),false)
                .map(entity -> CampingSlotModelEntityConverter.entity2model(entity))
                .collect(Collectors.toList());
    }
    @Override
    public boolean campingSlotAvailable(int id){
        return repository.existsByIdAndAndStatusIsTrue(id);
    }

    @Override
    public CampingSlot readById(int id){
        return CampingSlotModelEntityConverter.entity2model(repository.getById(id));
    }

    @Override
    public void reserveCampingslot(CampingSlot campingSlot){
        repository.save(CampingSlotModelEntityConverter.model2Entity(campingSlot));
    }



    public static class CampingSlotModelEntityConverter{

        public static hu.uni.eku.tzs.dao.entity.CampingSlotEntity model2Entity(CampingSlot campingSlot){
            return hu.uni.eku.tzs.dao.entity.CampingSlotEntity.builder()
                    .id(campingSlot.getId())
                    .coordinateX(campingSlot.getCoordinateX())
                    .coordinateY(campingSlot.getCoordinateY())
                    .price(campingSlot.getPrice())
                    .status(campingSlot.getStatus())
                    .description(campingSlot.getDescription())
                    .build();

        }

        public static CampingSlot entity2model(hu.uni.eku.tzs.dao.entity.CampingSlotEntity entity){
            return new CampingSlot(
                    entity.getId(),
                    entity.getCoordinateX(),
                    entity.getCoordinateY(),
                    entity.getPrice(),
                    entity.getStatus(),
                    entity.getDescription()
            );
        }

    }

}
