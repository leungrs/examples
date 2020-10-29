package com.winson.springcloud.dao;

import com.winson.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
