package com.example.designpattern.stuctural.proxy;

import com.example.designpattern.stuctural.proxy.image.Image;
import com.example.designpattern.stuctural.proxy.image.ProxyImage;

public class ProxyClient {
    public static void main(String[] args) {
        Image image = new ProxyImage("text.jpg");
        for (int i = 0; i < 10; i++) {
            image.display();
        }

    }
}
