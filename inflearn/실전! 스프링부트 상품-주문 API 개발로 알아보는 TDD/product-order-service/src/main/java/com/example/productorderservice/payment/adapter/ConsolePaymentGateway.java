package com.example.productorderservice.payment.adapter;

import org.springframework.stereotype.Component;

@Component
public class ConsolePaymentGateway implements PaymentGateway {

    @Override
    public void excute(int price, String cardNumber) {
        System.out.println("결제 완료 - [price: " + price + ", card number: " + cardNumber + "]");
    }
}
