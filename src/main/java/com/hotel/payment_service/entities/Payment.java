package com.hotel.payment_service.entities;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Payment {

    @Id
    private UUID id;
    private Date paymentDate;
    private String paymentStatus;
    private int paymentAmount;

}
