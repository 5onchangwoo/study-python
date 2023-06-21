package com.ume.jpapaging.model.dto;

import com.ume.jpapaging.model.entity.Content;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ContentDTO {

    private String title;
    private String detail;

    public static ContentDTO of(Content content) {
        return ContentDTO.builder()
                .title(content.getTitle())
                .detail(content.getDetail())
                .build();
    }
}
