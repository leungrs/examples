package com.winson.springcloud.controller;


import com.winson.springcloud.entities.CommonResult;
import com.winson.springcloud.entities.Payment;
import com.winson.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;


    @PostMapping("/payment/create")
    public CommonResult create(Payment payment) {
        int result = paymentService.create(payment);
        log.info("******result is " + result);
        if(result > 0) {
            return new CommonResult(200, "插入数据成功", result);
        } else {
            return new CommonResult(404, "插入数据失败", result);
        }
    }

    @GetMapping("/payment/getPaymentById")
    public CommonResult getPaymentById(Long id) {
        Payment result = paymentService.getPaymentById(id);
        log.info("******result is " + result);
        if(result != null) {
            return new CommonResult(200, "查询数据成功", result);
        } else {
            return new CommonResult(404, "查询数据失败", result);
        }
    }


}
