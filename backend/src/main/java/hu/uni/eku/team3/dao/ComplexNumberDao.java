package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.ComplexNumber;

import java.util.Collection;

public interface ComplexNumberDao {

    void create(ComplexNumber complexNumber);

    Collection<ComplexNumber> readAll();

    void update(ComplexNumber original, ComplexNumber updated);

    void delete(ComplexNumber complexNumber);
}
