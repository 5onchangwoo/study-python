package com.example.designpattern.stuctural.composite.file;

public class OrdinaryFile implements File {
    private String name;
    private int size;

    public OrdinaryFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
