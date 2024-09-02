package com.pkDev.project.uber.uberApp.strategies;

import com.pkDev.project.uber.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER=10;

    double calculateFare(RideRequest rideRequest);
}
