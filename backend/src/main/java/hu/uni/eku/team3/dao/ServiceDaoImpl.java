package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Service;
import lombok.RequiredArgsConstructor;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@org.springframework.stereotype.Service
public class ServiceDaoImpl implements ServiceDao {
    private final ServiceRepository repository;
    @Override
    public void create(Service ServiceCreate) {

    }

    @Override
    public Collection<Service> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(),false)
                .map(entity -> ServiceDaoImpl.ServiceEntityModleConverter.entity2model(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void update(Integer original, Service updated) {

    }

    @Override
    public void delete(Integer ServiceDelete) {

    }
    private static class ServiceEntityModleConverter{
        private static Service entity2model(hu.uni.eku.team3.dao.entity.Service entity){
            return new Service(
                    entity.getId(),
                    entity.getName(),
                    entity.getPrice()
            );
        }
        private static hu.uni.eku.team3.dao.entity.Service model2entity(Service model){
            return hu.uni.eku.team3.dao.entity.Service.builder()
                    .id(model.getId())
                    .name(model.getName())
                    .price(model.getPrice())
                    .build();
        }
    }
}
