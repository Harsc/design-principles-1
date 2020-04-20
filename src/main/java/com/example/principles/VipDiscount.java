package com.example.principles;

import org.springframework.stereotype.Component;

@Component
public class VipDiscount implements Discount {
    @Override
    public String getCouponType() {
        return CouponConstant.VIP.toString();
    }

    @Override
    public double discount(double count) {
        return count * 0.3;
    }
}
