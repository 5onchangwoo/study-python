package com.ume.jpapaging.controller;

import com.ume.jpapaging.model.dto.ContentDTO;
import com.ume.jpapaging.model.dto.ResponseDTO;
import com.ume.jpapaging.model.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class ContentController {

    private final ContentService contentService;

    @GetMapping("contents")
    public ResponseEntity<ResponseDTO> getContentsList(@PageableDefault(page = 0, size = 5, sort = "title", direction = Sort.Direction.ASC) Pageable pageable) {
        Page<ContentDTO> contentList = contentService.getContentList(pageable);
        ResponseDTO res = ResponseDTO.builder()
                .result("성공적으로 조회했습니다.")
                .data(contentList)
                .build();

        return ResponseEntity.ok().body(res);
    }

}
