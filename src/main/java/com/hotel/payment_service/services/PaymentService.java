package com.hotel.payment_service.services;

import com.hotel.payment_service.dtos.PaymentDto;

import java.util.UUID;

//@Service
public interface PaymentService {

    //@Autowired
     //PaymentRepo paymentRepo;

    PaymentDto getPayment(UUID id);

    void newPayment(PaymentDto paymentDto);

    PaymentDto modifyPayment(UUID id, PaymentDto updatedPaymentDto);

    void deletePayment(UUID id);

}
