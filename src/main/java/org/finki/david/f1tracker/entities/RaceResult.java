package org.finki.david.f1tracker.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class RaceResult {
    @Id
    private int id;
    private int position;
    private int points;
    private String fastestLap;
}
