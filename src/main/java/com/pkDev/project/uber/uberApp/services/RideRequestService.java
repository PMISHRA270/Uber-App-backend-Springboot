package com.pkDev.project.uber.uberApp.services;

import com.pkDev.project.uber.uberApp.entities.RideRequest;

public interface RideRequestService {

    RideRequest findRideRequestById(Long rideRequestId);

    void update(RideRequest rideRequest);
}
