package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Service;

import java.util.Collection;

public interface ServiceDao {
    void create(Service serviceCreate);

    Collection<Service> readAll();

    void update(Integer original, Service updated);

    void delete(Integer ServiceDelete);
}
