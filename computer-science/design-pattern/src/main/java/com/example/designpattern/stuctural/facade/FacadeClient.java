package com.example.designpattern.stuctural.facade;

import com.example.designpattern.stuctural.facade.facade.OnlineOrderFacade;

public class FacadeClient {
    public static void main(String[] args) {
        OnlineOrderFacade onlineOrderFacade = new OnlineOrderFacade();
        onlineOrderFacade.placeOrder();
    }
}
