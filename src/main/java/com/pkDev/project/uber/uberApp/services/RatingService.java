package com.pkDev.project.uber.uberApp.services;

import com.pkDev.project.uber.uberApp.dto.DriverDto;
import com.pkDev.project.uber.uberApp.dto.RiderDto;
import com.pkDev.project.uber.uberApp.entities.Ride;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
