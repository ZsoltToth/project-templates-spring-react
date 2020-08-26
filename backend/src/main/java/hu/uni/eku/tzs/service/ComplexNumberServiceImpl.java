package hu.uni.eku.tzs.service;

import hu.uni.eku.tzs.dao.ComplexNumberDao;
import hu.uni.eku.tzs.model.ComplexNumber;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Slf4j
@RequiredArgsConstructor
@Service
public class ComplexNumberServiceImpl implements ComplexNumberService {

    private final ComplexNumberDao dao;

    @Override
    public void record(ComplexNumber complexNumber) {
        dao.create(complexNumber);
    }

    @Override
    public Collection<ComplexNumber> readAll() {
        return dao.readAll();
    }
}
