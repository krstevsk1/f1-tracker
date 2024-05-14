package org.finki.david.f1tracker.repos;

import org.finki.david.f1tracker.entities.Driver;
import org.finki.david.f1tracker.entities.RaceResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceResultRepo extends JpaRepository<RaceResult, Integer> {
}