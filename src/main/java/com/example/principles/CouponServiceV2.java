package com.example.principles;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CouponServiceV2 {

    /**
     * 将折扣类型保存到这个Map中
     */
    Map<String, Discount> discountMap = new HashMap<>(16);

    public CouponServiceV2(List<Discount> discounts) {
        discounts.forEach(discount -> {
            this.discountMap.put(discount.getCouponType(), discount);
        });
    }

    /**
     * 根据优惠券的类型进行金额计算
     *
     * @param type
     * @param count
     * @return
     */
    public double calculate(@NonNull CouponConstant type, @NonNull double count) {
        return discountMap.get(type.toString()).discount(count);
    }

}
