package com.hotel.payment_service.controllers;

import com.hotel.payment_service.dtos.PaymentDto;
import com.hotel.payment_service.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/show/{id}")
    public PaymentDto retrievePayment(@PathVariable UUID id) {
        return paymentService.getPayment(id);
    }

    @PostMapping("/addPayment")
    public String addPayment(@RequestBody PaymentDto paymentDto) {

        paymentService.newPayment(paymentDto);
        return "Payment Successful";
    }

    @PutMapping("/updatePayment/{id}")
    public PaymentDto updatePayment(@RequestBody PaymentDto paymentDto, @PathVariable UUID id) {
        return paymentService.modifyPayment(id,paymentDto);
        //return ;
    }

    @DeleteMapping("/delete/{id}")
    public String removePayment(@PathVariable UUID id) {
        paymentService.deletePayment(id);
        return "Payment Deleted";
    }
}
