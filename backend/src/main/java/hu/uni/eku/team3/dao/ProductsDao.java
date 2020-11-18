package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Products;

import java.util.Collection;

public interface ProductsDao {
    void create(Products productsCreate);

    Collection<Products> readAll();

    void update(Integer original, Products updated);

    void delete(Integer productsDelete);
}
