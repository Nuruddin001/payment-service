package com.hotel.payment_service.services;

import com.hotel.payment_service.dtos.PaymentDto;
import com.hotel.payment_service.entities.Payment;
import com.hotel.payment_service.mappers.PaymentMapper;
import com.hotel.payment_service.repositories.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;
    private PaymentMapper paymentMapper;

    @Override
    public PaymentDto getPayment(int id) {
        Payment paymentR = paymentRepo.getReferenceById(id);
        return paymentMapper.fromPaymentEntitytoPaymentDto(paymentR);
    }
}
