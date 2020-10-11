package hu.uni.eku.afp2020_team4.service;

import hu.uni.eku.afp2020_team4.model.ComplexNumber;
import hu.uni.eku.afp2020_team4.service.exceptions.ComplexNumberAlreadyExistsException;

import java.util.Collection;

public interface ComplexNumberService {

    void record(ComplexNumber complexNumber) throws ComplexNumberAlreadyExistsException;

    Collection<ComplexNumber> readAll();
}
