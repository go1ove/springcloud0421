package org.example.moduls.service.impl;

import org.example.moduls.entity.Payment;
import org.example.moduls.mapper.PaymentMapper;
import org.example.moduls.service.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenxiang
 * @since 2021/4/22
 */
@Service
public class PaymentServiceImpl implements IPaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public void add(Payment payment) {
        paymentMapper.add(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentMapper.getPaymentById(id);
    }
}
