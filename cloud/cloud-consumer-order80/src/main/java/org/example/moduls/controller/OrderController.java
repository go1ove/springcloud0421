package org.example.moduls.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.moduls.entity.Payment;
import org.example.moduls.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenxiang
 * @since 2021/4/23
 */
@RestController
@Slf4j
public class OrderController {

    @Value("${payment.url}")
    private String paymentUrl;

    @Autowired
    private RestTemplate restTemplate;


    @PostMapping("/consumer/payment/add")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(paymentUrl + "/payment/add", payment, CommonResult.class);
    }

    @PostMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") int id) {
        return restTemplate.getForObject(paymentUrl + "/payment/get/" + id, CommonResult.class);
    }

}
