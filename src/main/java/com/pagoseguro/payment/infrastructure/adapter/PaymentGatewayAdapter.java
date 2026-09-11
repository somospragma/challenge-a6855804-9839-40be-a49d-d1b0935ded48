package com.pagoseguro.payment.infrastructure.adapter;

import com.pagoseguro.payment.domain.model.Payment;

public class PaymentGatewayAdapter {
    public Payment processPayment(Payment payment) {
        // Implement integration with payment gateway
        return payment;
    }
}