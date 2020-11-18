package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Summary;

import java.util.Collection;

public interface SummaryDao {
    void create(Summary summaryCreate);

    Collection<Summary> readAll();

    void update(Integer original, Summary updated);

    void delete(Integer summaryDelete);
}
