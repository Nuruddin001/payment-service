package com.hotel.payment_service.services;

import com.hotel.payment_service.dtos.PaymentDto;
import com.hotel.payment_service.entities.Payment;
import com.hotel.payment_service.mappers.PaymentMapper;
import com.hotel.payment_service.repositories.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepo paymentRepo;
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public PaymentDto getPayment(UUID id) {
        Payment paymentR = paymentRepo.getReferenceById(id);
        return paymentMapper.fromPaymentEntitytoPaymentDto(paymentR);
    }

    @Override
    public void newPayment(PaymentDto paymentDto) {
        Payment payment = paymentMapper.fromPaymentDtoToPaymentEntity(paymentDto);
        paymentRepo.save(payment);
    }

    @Override
    public PaymentDto modifyPayment(UUID id, PaymentDto updatedPaymentDto) {
        Payment pay = paymentRepo.getReferenceById(id);
        pay.setPaymentDate(updatedPaymentDto.getPaymentDate());
        pay.setPaymentAmount(updatedPaymentDto.getPaymentAmount());
        pay.setPaymentStatus(updatedPaymentDto.getPaymentStatus());
        paymentRepo.save(pay);
        return paymentMapper.fromPaymentEntitytoPaymentDto(pay);

    }

    @Override
    public void deletePayment(UUID id) {
        paymentRepo.deleteById(id);
    }
}
