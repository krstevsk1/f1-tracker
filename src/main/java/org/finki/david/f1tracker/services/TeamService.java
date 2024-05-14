package org.finki.david.f1tracker.services;

import org.finki.david.f1tracker.entities.Team;

import java.util.List;

public interface TeamService {
    Team getTeam(Integer id);
    Team addTeam(Team team);
    Team updateTeam(int id, Team team);
    void deleteTeam(Integer id);
    List<Team> getAllTeams();
}
