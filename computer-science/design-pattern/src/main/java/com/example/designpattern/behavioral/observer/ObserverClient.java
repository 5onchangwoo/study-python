package com.example.designpattern.behavioral.observer;

import com.example.designpattern.behavioral.observer.observer.KeywordUser;
import com.example.designpattern.behavioral.observer.observer.Observer;
import com.example.designpattern.behavioral.observer.subject.Board;
import com.example.designpattern.behavioral.observer.subject.Post;

public class ObserverClient {
    public static void main(String[] args) {
        Board board = new Board();

        // 키워드 알림 신청 게시판 유저!
        Observer user1 = new KeywordUser("유저1", "이이팟");
        Observer user2 = new KeywordUser("유저2", "이이패드");
        Observer user3 = new KeywordUser("유저3", "이이팟");
        board.registerObserver(user1);
        board.registerObserver(user2);
        board.registerObserver(user3);

        board.addPosts(new Post("이이팟 팝니다", "새상품 25만원에 팔아요"));
        board.addPosts(new Post("이이패드 팝니다", "한번만 써본 상품 52만원에 팔아요"));
        board.addPosts(new Post("축구공 팝니다", "축구 딱한번 해봤습니다. 5만원에 팔아요"));

        board.removeObserver(user3);

        board.addPosts(new Post("이이팟 오른쪽만 팝니다", "오른쪽 유닛만 남았네요... 팝니다 5만원"));

    }
}
