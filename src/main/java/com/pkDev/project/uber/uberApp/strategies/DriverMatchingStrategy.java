package com.pkDev.project.uber.uberApp.strategies;

import com.pkDev.project.uber.uberApp.entities.Driver;
import com.pkDev.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
