package org.finki.david.f1tracker.services.impl;

import lombok.AllArgsConstructor;
import org.finki.david.f1tracker.entities.Driver;
import org.finki.david.f1tracker.repos.DriverRepo;
import org.finki.david.f1tracker.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DriverServiceImpl implements DriverService {

    private final DriverRepo driverRepo;

    @Override
    public Driver findDriverById(Integer id) {
        return driverRepo.findById(id).orElse(null);
    }

    @Override
    public Driver createDriver(Driver driver) {
        return driverRepo.save(driver);
    }

    @Override
    public Driver updateDriver(int id, Driver driver) {
        Driver foundDriver = findDriverById(id);
        foundDriver.setName(driver.getName());
        return driverRepo.save(foundDriver);
    }

    @Override
    public void deleteDriver(Integer id) {
        driverRepo.deleteById(id);
    }

    @Override
    public List<Driver> findAllDrivers() {
        return driverRepo.findAll();
    }
}
