package com.example.designpattern.stuctural.proxy.image;

public class ProxyImage implements Image{
    private RealImage realImage;


    public ProxyImage(String filename) {
        this.realImage = new RealImage(filename);
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(realImage.getFilename());
        }
        realImage.display();
    }
}
