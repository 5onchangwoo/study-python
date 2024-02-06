package com.example.designpattern.stuctural.composite;

import com.example.designpattern.stuctural.composite.file.Directory;
import com.example.designpattern.stuctural.composite.file.File;
import com.example.designpattern.stuctural.composite.file.OrdinaryFile;

public class Main {
    public static void main(String[] args) {
        // 메인 복합객체 생성하기
        Directory rootDirectory = new Directory("루트디렉터리");

        // 메인복합객체에 단일객체 넣기
        OrdinaryFile internet = new OrdinaryFile("인터넷", 50);
        OrdinaryFile notePad = new OrdinaryFile("메모장", 5);

        rootDirectory.addFile(internet);
        rootDirectory.addFile(notePad);

        // 복합객체 안에 복합객체 넣기
        Directory gameDirectory = new Directory("게임디렉터리");

        OrdinaryFile lostArk = new OrdinaryFile("잃어버린 방주", 2550);
        OrdinaryFile lol = new OrdinaryFile("전설들의 경기", 1200);

        gameDirectory.addFile(lostArk);
        gameDirectory.addFile(lol);
        rootDirectory.addFile(gameDirectory);

        // 정보 출력하기
            // 복합객체 확인
        printSize(rootDirectory);
        printSize(gameDirectory);
            // 단일 객체 확인
        printSize(lostArk);

    }

    private static void printSize(File file) {
        int sumSize = file.getSize();
        System.out.println(file.getName() + "의 용량은 " + sumSize + "입니다.");
    }
}
