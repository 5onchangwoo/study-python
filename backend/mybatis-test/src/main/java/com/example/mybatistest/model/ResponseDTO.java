package com.example.mybatistest.model;

import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseDTO {
    private String msg;
    private String code;
    private Object data;
}
