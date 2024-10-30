package com.hotel.payment_service.controllers;

import com.hotel.payment_service.dtos.PaymentDto;
import com.hotel.payment_service.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/show/{id}")
    public PaymentDto retrievePayment(@PathVariable int id) {
        return paymentService.getPayment(id);
    }
}
