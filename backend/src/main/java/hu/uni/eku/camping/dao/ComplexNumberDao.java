package hu.uni.eku.camping.dao;

import hu.uni.eku.camping.model.ComplexNumber;

import java.util.Collection;

public interface ComplexNumberDao {

    void create(ComplexNumber complexNumber);

    Collection<ComplexNumber> readAll();

    void update(ComplexNumber original, ComplexNumber updated);

    void delete(ComplexNumber complexNumber);
}
