package org.example.moduls.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.moduls.entity.Payment;

/**
 * @author chenxiang
 * @since 2021/4/22
 */
@Mapper
public interface PaymentMapper {


    void add(@Param("payment") Payment payment);

    Payment getPaymentById(@Param("id") Integer id);
}
