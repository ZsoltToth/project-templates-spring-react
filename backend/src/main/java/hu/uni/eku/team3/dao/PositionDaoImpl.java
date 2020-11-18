package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Position;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class PositionDaoImpl implements PositionDao {
    private final PositionRepository repository;
    @Override
    public void create(Position positionCreate) {

    }

    @Override
    public Collection<Position> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(),false)
                .map(entity->PositionEntityModleConverter.entity2model(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void update(Position original, Position updated) {

    }

    @Override
    public void delete(Position positionDelete) {

    }
    private static class PositionEntityModleConverter{
        private static Position entity2model(hu.uni.eku.team3.dao.entity.Position entity){
            return new Position(
                    entity.getId(),
                    entity.getName()
            );
        }
        private static hu.uni.eku.team3.dao.entity.Position model2entity(Position model){
            return hu.uni.eku.team3.dao.entity.Position.builder()
                    .id(model.getId())
                    .name(model.getName())
                    .build();
        }
    }
}
