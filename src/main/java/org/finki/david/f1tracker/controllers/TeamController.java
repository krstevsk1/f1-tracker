package org.finki.david.f1tracker.controllers;

import lombok.AllArgsConstructor;
import org.finki.david.f1tracker.entities.Team;
import org.finki.david.f1tracker.services.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/team")
@RestController
public class TeamController {

    private final TeamService teamService;

    @GetMapping("/{id}")
    ResponseEntity<Team> getTeam(@PathVariable int id) {
        return ResponseEntity.ok(teamService.getTeam(id));
    }

    @GetMapping("/all")
    ResponseEntity<List<Team>> getAllRaces() {
        return ResponseEntity.ok(teamService.getAllTeams());
    }

    @PostMapping
    ResponseEntity<Team> createTeam(@RequestBody Team team) {
        return ResponseEntity.ok(teamService.addTeam(team));
    }

    @PutMapping("/{id}")
    ResponseEntity<Team> updateTeam(@PathVariable int id, @RequestBody Team team) {
        return ResponseEntity.ok(teamService.updateTeam(id, team));
    }

    @DeleteMapping("/{id}")
    void deleteRace(@PathVariable int id) {
        teamService.deleteTeam(id);
    }
}
