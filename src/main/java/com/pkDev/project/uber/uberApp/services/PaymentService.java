package com.pkDev.project.uber.uberApp.services;

import com.pkDev.project.uber.uberApp.entities.Payment;
import com.pkDev.project.uber.uberApp.entities.Ride;
import com.pkDev.project.uber.uberApp.entities.enums.PaymentStatus;

public interface PaymentService {

    void processPayment(Ride ride);

    Payment createNewPayment(Ride ride);

    void updatePaymentStatus(Payment payment, PaymentStatus status);
}
