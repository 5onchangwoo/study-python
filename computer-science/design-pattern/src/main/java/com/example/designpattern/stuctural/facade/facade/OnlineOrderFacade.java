package com.example.designpattern.stuctural.facade.facade;

import com.example.designpattern.stuctural.facade.subsystem.InventorySystem;
import com.example.designpattern.stuctural.facade.subsystem.PaymentSystem;
import com.example.designpattern.stuctural.facade.subsystem.ShippingSystem;

public class OnlineOrderFacade {
    private InventorySystem inventorySystem;
    private PaymentSystem paymentSystem;
    private ShippingSystem shippingSystem;

    public OnlineOrderFacade() {
        this.inventorySystem = new InventorySystem();
        this.paymentSystem = new PaymentSystem();
        this.shippingSystem = new ShippingSystem();
    }

    public void placeOrder() {
        System.out.println("온라인 주문하기");
        paymentSystem.processPayment();
        inventorySystem.updateInventory();
        shippingSystem.shipOrder();
        System.out.println("온라인 주문이 완료되었습니다.");
    }
}
