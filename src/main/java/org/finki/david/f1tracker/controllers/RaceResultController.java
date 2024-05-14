package org.finki.david.f1tracker.controllers;

import lombok.AllArgsConstructor;
import org.finki.david.f1tracker.entities.RaceResult;
import org.finki.david.f1tracker.services.RaceResultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/raceResult")
@RestController
public class RaceResultController {

    private final RaceResultService raceResultService;

    @GetMapping("/{id}")
    ResponseEntity<RaceResult> getTeam(@PathVariable int id) {
        return ResponseEntity.ok(raceResultService.getRaceResult(id));
    }

    @GetMapping("/all")
    ResponseEntity<List<RaceResult>> getAllRaces() {
        return ResponseEntity.ok(raceResultService.getAllRaceResults());
    }

    @PostMapping
    ResponseEntity<RaceResult> createTeam(@RequestBody RaceResult raceResult) {
        return ResponseEntity.ok(raceResultService.addRaceResult(raceResult));
    }

    @PutMapping("/{id}")
    ResponseEntity<RaceResult> updateTeam(@PathVariable int id, @RequestBody RaceResult raceResult) {
        return ResponseEntity.ok(raceResultService.updateRaceResult(id, raceResult));
    }

    @DeleteMapping("/{id}")
    void deleteRace(@PathVariable int id) {
        raceResultService.deleteRaceResult(id);
    }
}
