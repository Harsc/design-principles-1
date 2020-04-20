package com.example.principles;

import org.springframework.lang.NonNull;

/**
 * 优惠接口
 */
public interface Discount {

    /**
     * 获取当前消费券类型
     *
     * @return
     */
    String getCouponType();

    /**
     * 根据原价进行折扣处理
     *
     * @param count
     * @return
     */
    double discount(@NonNull double count);

}
