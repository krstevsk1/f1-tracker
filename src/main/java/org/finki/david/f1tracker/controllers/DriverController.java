package org.finki.david.f1tracker.controllers;

import lombok.AllArgsConstructor;
import org.finki.david.f1tracker.entities.Driver;
import org.finki.david.f1tracker.services.DriverService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("/driver")
@RestController
public class DriverController {

    private final DriverService driverService;

    @GetMapping("/{id}")
    ResponseEntity<Driver> getDriver(@PathVariable int id) {
        return ResponseEntity.ok(driverService.findDriverById(id));
    }

    @GetMapping("/all")
    ResponseEntity<List<Driver>> getAllDrivers() {
        return ResponseEntity.ok(driverService.findAllDrivers());
    }

    @PostMapping
    ResponseEntity<Driver> createDriver(@RequestBody Driver driver) {
        return ResponseEntity.ok(driverService.createDriver(driver));
    }

    @PutMapping("/{id}")
    ResponseEntity<Driver> updateDriver(@PathVariable int id, @RequestBody Driver driver) {
        return ResponseEntity.ok(driverService.updateDriver(id, driver));
    }

    @DeleteMapping("/{id}")
    void deleteDriver(@PathVariable int id) {
        driverService.deleteDriver(id);
    }
}
