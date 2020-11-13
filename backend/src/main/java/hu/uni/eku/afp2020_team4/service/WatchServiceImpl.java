package hu.uni.eku.afp2020_team4.service;

import hu.uni.eku.afp2020_team4.dao.WatchDao;
import hu.uni.eku.afp2020_team4.model.Watch;
import hu.uni.eku.afp2020_team4.service.exceptions.WatchAlreadyExistsException;
import hu.uni.eku.afp2020_team4.service.exceptions.WatchNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class WatchServiceImpl implements WatchService {

    private final WatchDao dao;

    @Override
    public void create(Watch watchToCreate) throws WatchAlreadyExistsException {
        final boolean alreadyExists = dao.fetchAll()
                .stream()
                .anyMatch(watch -> watch.getWatchId().equals(watchToCreate.getWatchId()));
        if(alreadyExists){
            throw new WatchAlreadyExistsException(String.format("Watch (%s) already exists!", watchToCreate.toString()));
        }

        dao.create(watchToCreate);
    }

    @Override
    public Collection<Watch> fetchAll() {
        return dao.fetchAll();
    }

    @Override
    public void update(String watchId, Watch newWatch) throws WatchNotFoundException {
        dao.update(watchId, newWatch);
    }

    @Override
    public void delete(String watchId) throws WatchNotFoundException {
        dao.delete(watchId);
    }
}
