package hu.uni.eku.team3.service;

import hu.uni.eku.team3.model.ComplexNumber;
import hu.uni.eku.team3.service.exceptions.ComplexNumberAlreadyExistsException;

import java.util.Collection;

public interface ComplexNumberService {

    void record(ComplexNumber complexNumber) throws ComplexNumberAlreadyExistsException;

    Collection<ComplexNumber> readAll();
}
