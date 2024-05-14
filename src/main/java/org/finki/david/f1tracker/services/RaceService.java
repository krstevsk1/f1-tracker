package org.finki.david.f1tracker.services;

import org.finki.david.f1tracker.entities.Race;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RaceService {
    Race getRace(int id);
    List<Race> getAllRaces();
    Race addRace(Race race);
    Race updateRace(int id, Race race);
    void deleteRace(int id);
}
