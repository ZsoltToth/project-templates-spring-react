package hu.uni.eku.camping.service;

import hu.uni.eku.camping.model.ComplexNumber;
import hu.uni.eku.camping.service.exceptions.ComplexNumberAlreadyExistsException;

import java.util.Collection;

public interface ComplexNumberService {

    void record(ComplexNumber complexNumber) throws ComplexNumberAlreadyExistsException;

    Collection<ComplexNumber> readAll();
}
