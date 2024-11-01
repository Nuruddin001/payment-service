package com.hotel.payment_service.repositories;

import com.hotel.payment_service.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;


public interface PaymentRepo extends JpaRepository<Payment, UUID> {
}
