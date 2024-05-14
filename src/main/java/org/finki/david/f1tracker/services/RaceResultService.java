package org.finki.david.f1tracker.services;

import org.finki.david.f1tracker.entities.RaceResult;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RaceResultService {
    RaceResult getRaceResult(int raceResultId);
    List<RaceResult> getAllRaceResults();
    RaceResult addRaceResult(RaceResult raceResult);
    RaceResult updateRaceResult(int id, RaceResult raceResult);
    void deleteRaceResult(int raceResultId);
}
