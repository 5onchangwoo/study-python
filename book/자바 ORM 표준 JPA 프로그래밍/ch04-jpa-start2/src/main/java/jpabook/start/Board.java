package jpabook.start;

import javax.persistence.*;

@Entity
@TableGenerator(
        name = "BOARD_SEQ_GENERATOR",
        table = "MY_SEQUENCES", //매핑할 데이터베이스 시퀀스 이름
        pkColumnValue = "BOARD_SEQ",
        initialValue = 1, allocationSize = 1
)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "BOARD_SEQ_GENERATOR")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
