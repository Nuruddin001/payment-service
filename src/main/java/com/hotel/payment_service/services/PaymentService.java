package com.hotel.payment_service.services;

import com.hotel.payment_service.dtos.PaymentDto;
import com.hotel.payment_service.entities.Payment;
import com.hotel.payment_service.repositories.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface PaymentService {

    //@Autowired
     //PaymentRepo paymentRepo;

    PaymentDto getPayment(int id);
       // return paymentRepo.getReferenceById(id);

}
