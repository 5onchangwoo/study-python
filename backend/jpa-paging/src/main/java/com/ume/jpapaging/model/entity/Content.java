package com.ume.jpapaging.model.entity;

import jakarta.persistence.*;
import lombok.*;


// lombok
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
// jpa
@Entity
@Table(name = "TBL_CONTENT")
@SequenceGenerator(
        name = "CONTENT_SEQUENCE",
        sequenceName = "CONTENT_NO_SEQ",
        initialValue = 1,
        allocationSize = 1
)
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTENT_SEQUENCE")
    @Column(name = "no", nullable = false)
    private Integer no;

    @Column(name = "title")
    private String title;

    @Column(name = "detail")
    private String detail;
}
