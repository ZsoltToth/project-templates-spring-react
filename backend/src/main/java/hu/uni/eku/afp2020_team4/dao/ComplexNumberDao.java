package hu.uni.eku.afp2020_team4.dao;

import hu.uni.eku.afp2020_team4.model.ComplexNumber;

import java.util.Collection;

public interface ComplexNumberDao {

    void create(ComplexNumber complexNumber);

    Collection<ComplexNumber> readAll();

    void update(ComplexNumber original, ComplexNumber updated);

    void delete(ComplexNumber complexNumber);
}
