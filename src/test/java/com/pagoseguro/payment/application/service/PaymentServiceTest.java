package com.pagoseguro.payment.application.service;

import com.pagoseguro.payment.domain.model.Payment;
import com.pagoseguro.payment.infrastructure.adapter.PaymentGatewayAdapter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PaymentServiceTest {
    @Autowired
    private PaymentService paymentService;

    @Test
    public void testProcessPayment() {
        Payment payment = new Payment();
        // Set payment details
        Payment processedPayment = paymentService.processPayment(payment);
        // Add assertions
    }
}