package org.finki.david.f1tracker.repos;

import org.finki.david.f1tracker.entities.Driver;
import org.finki.david.f1tracker.entities.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepo extends JpaRepository<Race, Integer> {
}
