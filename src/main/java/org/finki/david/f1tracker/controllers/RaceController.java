package org.finki.david.f1tracker.controllers;

import lombok.AllArgsConstructor;
import org.finki.david.f1tracker.entities.Race;
import org.finki.david.f1tracker.services.RaceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/race")
@RestController
public class RaceController {

    private final RaceService raceService;

    @GetMapping("/{id}")
    ResponseEntity<Race> getRace(@PathVariable int id) {
        return ResponseEntity.ok(raceService.getRace(id));
    }

    @GetMapping("/all")
    ResponseEntity<List<Race>> getAllRaces() {
        return ResponseEntity.ok(raceService.getAllRaces());
    }

    @PostMapping
    ResponseEntity<Race> createRace(@RequestBody Race race) {
        return ResponseEntity.ok(raceService.addRace(race));
    }

    @PutMapping("/{id}")
    ResponseEntity<Race> updateRace(@PathVariable int id, @RequestBody Race race) {
        return ResponseEntity.ok(raceService.updateRace(id, race));
    }

    @DeleteMapping("/{id}")
    void deleteRace(@PathVariable int id) {
        raceService.deleteRace(id);
    }
}
