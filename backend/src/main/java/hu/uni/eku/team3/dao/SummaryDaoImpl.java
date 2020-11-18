package hu.uni.eku.team3.dao;

import hu.uni.eku.team3.model.Summary;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class SummaryDaoImpl implements SummaryDao{
    private final SummaryRepository repository;
    @Override
    public void create(Summary SummaryCreate) {
        repository.save(SummaryDaoImpl.SummaryEntityModleConverter.model2entity(SummaryCreate));
    }

    @Override
    public Collection<Summary> readAll() {
        return StreamSupport.stream(repository.findAll().spliterator(),false)
                .map(entity -> SummaryDaoImpl.SummaryEntityModleConverter.entity2model(entity))
                .collect(Collectors.toList());
    }

    @Override
    public void update(Integer original, Summary updated) {

    }

    @Override
    public void delete(Integer SummaryDelete) {
        hu.uni.eku.team3.dao.entity.Summary result= repository.findUsageById(SummaryDelete);
        if(result!=null){
            repository.delete(result);
        }
    }
    private static class SummaryEntityModleConverter{
        private static Summary entity2model(hu.uni.eku.team3.dao.entity.Summary entity){
            return new Summary(
                    entity.getId(),
                    entity.getIdentityNumber(),
                    entity.getServicesID(),
                    entity.getBarCode()
            );
        }
        private static hu.uni.eku.team3.dao.entity.Summary model2entity(Summary model){
            return hu.uni.eku.team3.dao.entity.Summary.builder()
                    .id(model.getId())
                    .identityNumber(model.getIdentityNumber())
                    .servicesID(model.getServicesID())
                    .barCode(model.getBarCode())
                    .build();
        }
    }
}
