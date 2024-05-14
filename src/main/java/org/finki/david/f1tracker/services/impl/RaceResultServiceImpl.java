package org.finki.david.f1tracker.services.impl;

import lombok.AllArgsConstructor;
import org.finki.david.f1tracker.entities.RaceResult;
import org.finki.david.f1tracker.repos.RaceResultRepo;
import org.finki.david.f1tracker.services.RaceResultService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RaceResultServiceImpl implements RaceResultService {

    private final RaceResultRepo raceResultRepo;

    @Override
    public RaceResult getRaceResult(int raceResultId) {
        return raceResultRepo.findById(raceResultId).orElse(null);
    }

    @Override
    public List<RaceResult> getAllRaceResults() {
        return raceResultRepo.findAll();
    }

    @Override
    public RaceResult addRaceResult(RaceResult raceResult) {
        return raceResultRepo.save(raceResult);
    }

    @Override
    public RaceResult updateRaceResult(int id, RaceResult raceResult) {
        RaceResult foundRaceResult = raceResultRepo.findById(id).orElse(null);
        foundRaceResult.setPosition(raceResult.getPosition());
        foundRaceResult.setPoints(raceResult.getPoints());
        foundRaceResult.setFastestLap(raceResult.getFastestLap());
        return null;
    }

    @Override
    public void deleteRaceResult(int raceResultId) {
        raceResultRepo.deleteById(raceResultId);
    }
}
