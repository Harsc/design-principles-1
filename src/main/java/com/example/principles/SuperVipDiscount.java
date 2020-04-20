package com.example.principles;

import org.springframework.stereotype.Component;

@Component
public class SuperVipDiscount implements Discount {
    @Override
    public String getCouponType() {
        return CouponConstant.SUPERVIP.toString();
    }

    @Override
    public double discount(double count) {
        return count * 0.1 - 0.03;
    }
}
