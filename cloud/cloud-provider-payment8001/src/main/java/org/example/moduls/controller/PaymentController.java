package org.example.moduls.controller;

import org.example.moduls.entity.Payment;
import org.example.moduls.service.IPaymentService;
import org.example.moduls.vo.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chenxiang
 * @since 2021/4/22
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {


    @Autowired
    private IPaymentService paymentService;

    @PostMapping("/add")
    public CommonResult<Payment> add(@RequestBody Payment payment) {
        paymentService.add(payment);
        return new CommonResult(200, "成功！", payment);
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> get(@PathVariable("id") int id) {
        Payment payment = paymentService.getPaymentById(id);
        return new CommonResult(200, "成功！", payment);
    }
}
