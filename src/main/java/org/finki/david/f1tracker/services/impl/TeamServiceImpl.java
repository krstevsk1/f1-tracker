package org.finki.david.f1tracker.services.impl;

import lombok.AllArgsConstructor;
import org.finki.david.f1tracker.entities.Team;
import org.finki.david.f1tracker.repos.TeamRepo;
import org.finki.david.f1tracker.services.TeamService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamServiceImpl implements TeamService {

    private final TeamRepo teamRepo;

    @Override
    public Team getTeam(Integer id) {
        return teamRepo.findById(id).orElse(null);
    }

    @Override
    public Team addTeam(Team team) {
        return teamRepo.save(team);
    }

    @Override
    public Team updateTeam(int id, Team team) {
        Team foundTeam = getTeam(id);
        foundTeam.setName(team.getName());
        return teamRepo.save(foundTeam);
    }

    @Override
    public void deleteTeam(Integer id) {
        teamRepo.deleteById(id);
    }

    @Override
    public List<Team> getAllTeams() {
        return teamRepo.findAll();
    }
}
