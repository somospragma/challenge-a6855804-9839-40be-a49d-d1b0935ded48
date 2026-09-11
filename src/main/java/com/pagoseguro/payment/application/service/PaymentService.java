package com.pagoseguro.payment.application.service;

import com.pagoseguro.payment.domain.model.Payment;
import com.pagoseguro.payment.infrastructure.adapter.PaymentGatewayAdapter;

public class PaymentService {
    private final PaymentGatewayAdapter paymentGatewayAdapter;

    public PaymentService(PaymentGatewayAdapter paymentGatewayAdapter) {
        this.paymentGatewayAdapter = paymentGatewayAdapter;
    }

    public Payment processPayment(Payment payment) {
        // Implement business logic
        return paymentGatewayAdapter.processPayment(payment);
    }
}