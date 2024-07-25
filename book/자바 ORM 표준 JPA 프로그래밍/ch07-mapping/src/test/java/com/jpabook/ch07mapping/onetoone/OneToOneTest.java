package com.jpabook.ch07mapping.onetoone;

import com.jpabook.ch07mapping.onetoone.entity.Board;
import com.jpabook.ch07mapping.onetoone.entity.BoardDetail;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class OneToOneTest {

    @Autowired
    private EntityManager em;


    @Test
    @DisplayName("일대인 관계 저장 확인")
    @Transactional
    public void save() {
        //given
        Board board = new Board();
        board.setTitle("제목");

        BoardDetail boardDetail = new BoardDetail();
        boardDetail.setContent("내용");
        boardDetail.setBoard(board);
        board.setBoardDetail(boardDetail);

        //when
        em.persist(board);
        em.persist(boardDetail);

        //then
        Board foundBoard = em.find(Board.class, board.getId());
        BoardDetail foundBoardDetail = em.find(BoardDetail.class, boardDetail.getBoardId());
        System.out.println(foundBoard);
        assertThat(foundBoard)
                .isNotNull();
        assertThat(foundBoardDetail)
                .isNotNull();

    }

}