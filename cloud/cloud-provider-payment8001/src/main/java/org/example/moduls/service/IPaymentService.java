package org.example.moduls.service;

import org.example.moduls.entity.Payment;

/**
 * @author chenxiang
 * @since 2021/4/22
 */
public interface IPaymentService {


    void add(Payment payment);

    Payment getPaymentById(Integer id);
}
