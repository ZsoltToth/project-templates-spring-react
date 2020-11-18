package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Products;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class ProductsDaoImpl implements ProductsDao{
    private final ProductsRepository repository;
    @Override
    public void create(Products ProductsCreate) {

    }

    @Override
    public Collection<Products> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(),false)
                .map(entity -> ProductsDaoImpl.ProductsEntityModleConverter.entity2model(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void update(Integer original, Products updated) {

    }

    @Override
    public void delete(Integer ProductsDelete) {

    }
    private static class ProductsEntityModleConverter{
        private static Products entity2model(hu.uni.eku.team3.dao.entity.Products entity){
            return new Products(
                    entity.getId(),
                    entity.getProductName(),
                    entity.getProductPrice(),
                    entity.getAdult()
            );
        }
        private static hu.uni.eku.team3.dao.entity.Products model2entity(Products model){
            return hu.uni.eku.team3.dao.entity.Products.builder()
                    .id(model.getId())
                    .productName(model.getProductName())
                    .productPrice(model.getProductPrice())
                    .Adult(model.getAdult())
                    .build();
        }
    }
}
