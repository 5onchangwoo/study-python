package com.example.designpattern.stuctural.composite.file;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File{
    private List<File> files;
    private String name;

    public Directory(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public List<File> getFiles() {
        return this.files;
    }


    @Override
    public int getSize() {
        int sumSize = 0;
        for (File file : files) {
            sumSize += file.getSize();
        }
        return sumSize;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
