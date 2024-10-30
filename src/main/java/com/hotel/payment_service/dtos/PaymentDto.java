package com.hotel.payment_service.dtos;

import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class PaymentDto {
    @Id
    private UUID id;
    private Date paymentDate;
    private String paymentStatus;
    private int paymentAmount;
}
