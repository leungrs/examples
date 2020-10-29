package com.winson.springcloud.service;

import com.winson.springcloud.entities.Payment;

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
