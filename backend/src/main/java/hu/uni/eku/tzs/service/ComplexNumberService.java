package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.model.ComplexNumber;

import java.util.Collection;

public interface ComplexNumberService {

    void record(ComplexNumber complexNumber);

    Collection<ComplexNumber> readAll();
}
