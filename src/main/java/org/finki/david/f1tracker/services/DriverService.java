package org.finki.david.f1tracker.services;

import org.finki.david.f1tracker.entities.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DriverService {
    Driver findDriverById(Integer id);
    Driver createDriver(Driver driver);
    Driver updateDriver(int id, Driver driver);
    void deleteDriver(Integer id);
    List<Driver> findAllDrivers();
}
