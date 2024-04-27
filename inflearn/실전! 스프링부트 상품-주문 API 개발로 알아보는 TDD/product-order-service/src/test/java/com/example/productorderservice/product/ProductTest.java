package com.example.productorderservice.product;

import com.example.productorderservice.product.domain.DiscountPolicy;
import com.example.productorderservice.product.domain.Product;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductTest {

    @Test
    void update() {
        Product product = new Product("상품명", 1000, DiscountPolicy.NONE);

        product.update("상품 수정", 2000, DiscountPolicy.NONE);
        assertThat(product.getName()).isEqualTo("상품 수정");
        assertThat(product.getPrice()).isEqualTo(2000);
    }

    @Test
    void none_discounted_product() {
        Product product = new Product("상품명", 1000, DiscountPolicy.NONE);
        int discountPrice = product.getDiscountPrice();
        assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    void fix_1000_discounted_product() {
        Product product = new Product("상품명", 2000, DiscountPolicy.FIX_1000_AMOUNT);
        int discountPrice = product.getDiscountPrice();
        assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    void fix_1000_discounted_product_under_1000() {
        Product product = new Product("상품명", 500, DiscountPolicy.FIX_1000_AMOUNT);
        int discountPrice = product.getDiscountPrice();
        assertThat(discountPrice).isEqualTo(0);
    }


}