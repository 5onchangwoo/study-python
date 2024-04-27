package com.example.productorderservice.product;

import com.example.productorderservice.product.domain.DiscountPolicy;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class DiscountPolicyTest {

    @Test
    void noneDiscountPolicy() {
        int price = 1000;
        int discountedPrice = DiscountPolicy.NONE.applyDiscount(price);
        assertThat(discountedPrice).isEqualTo(price);
    }

    @Test
    void fix1000DiscountPolicyMinus() {
        int price = 500;
        int discountedPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);
        assertThat(discountedPrice).isEqualTo(0);
    }

    @Test
    void fix1000DiscountPolicy() {
        int price = 2000;
        int discountedPrice = DiscountPolicy.FIX_1000_AMOUNT.applyDiscount(price);
        assertThat(discountedPrice).isEqualTo(1000);
    }
}