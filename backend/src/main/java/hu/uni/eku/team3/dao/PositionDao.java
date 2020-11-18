package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Position;

import java.util.Collection;

public interface PositionDao {
    void create(Position positionCreate);

    Collection<Position> readAll();

    void update(Position original, Position updated);

    void delete(Position positionDelete);
}
