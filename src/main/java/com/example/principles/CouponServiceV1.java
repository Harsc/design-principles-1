package com.example.principles;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceV1 {

    /**
     * 根据优惠券的类型进行金额计算
     *
     * @param type
     * @param count
     * @return
     */
    public double calculate(@NonNull CouponConstant type, @NonNull double count) {
        if (type.equals(CouponConstant.VIP)) {
            return count * 0.3;
        }
        if (type.equals(CouponConstant.SUPERVIP)) {
            return count * 0.1 - 0.03;
        }
        return count * 0.5;
    }

}
