package org.finki.david.f1tracker.repos;

import org.finki.david.f1tracker.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepo extends JpaRepository<Team, Integer> {
}
