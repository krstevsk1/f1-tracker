package org.finki.david.f1tracker.services.impl;

import lombok.AllArgsConstructor;
import org.finki.david.f1tracker.entities.Driver;
import org.finki.david.f1tracker.entities.Race;
import org.finki.david.f1tracker.repos.RaceRepo;
import org.finki.david.f1tracker.repos.TeamRepo;
import org.finki.david.f1tracker.services.RaceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RaceServiceImpl implements RaceService {

    private final RaceRepo raceRepo;

    @Override
    public Race getRace(int id) {
        return raceRepo.findById(id).orElse(null);
    }

    @Override
    public List<Race> getAllRaces() {
        return raceRepo.findAll();
    }

    @Override
    public Race addRace(Race race) {
        return raceRepo.save(race);
    }

    @Override
    public Race updateRace(int id, Race race) {
        Race foundRace = getRace(id);
        foundRace.setName(race.getName());
        return raceRepo.save(foundRace);
    }

    @Override
    public void deleteRace(int id) {
        raceRepo.deleteById(id);
    }
}
