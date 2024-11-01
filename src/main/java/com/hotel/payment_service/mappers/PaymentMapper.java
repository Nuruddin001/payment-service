package com.hotel.payment_service.mappers;

import com.hotel.payment_service.dtos.PaymentDto;
import com.hotel.payment_service.entities.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {

    public PaymentDto fromPaymentEntitytoPaymentDto(Payment payment) {

        PaymentDto paymentDto = new PaymentDto();
        paymentDto.setId(payment.getId());
        paymentDto.setPaymentAmount(payment.getPaymentAmount());
        paymentDto.setPaymentDate(payment.getPaymentDate());
        paymentDto.setPaymentStatus(payment.getPaymentStatus());
        return paymentDto;
    }

    public Payment fromPaymentDtoToPaymentEntity(PaymentDto paymentDto) {
        Payment payment = new Payment();
        payment.setId(paymentDto.getId());
        payment.setPaymentAmount(paymentDto.getPaymentAmount());
        payment.setPaymentDate(paymentDto.getPaymentDate());
        payment.setPaymentStatus(paymentDto.getPaymentStatus());
        return payment;
    }
}
