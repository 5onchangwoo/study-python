package com.ume.jpapaging.model.service;

import com.ume.jpapaging.model.dto.ContentDTO;
import com.ume.jpapaging.model.dto.PageMetaData;
import com.ume.jpapaging.model.dto.PagedDTO;
import com.ume.jpapaging.model.entity.Content;
import com.ume.jpapaging.model.respository.ContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContentService {
    private final ContentRepository contentRepository;

    public PagedDTO<List<ContentDTO>> getContentList(Pageable pageable) {

        Page<Content> pageResult = contentRepository.findAll(pageable);

        List<ContentDTO> contentDTOList = pageResult.getContent().stream().map(ContentDTO::of).toList();

        PageMetaData pageMetaData = new PageMetaData(pageResult.getSize(),
                pageResult.getTotalElements(), pageResult.getTotalPages(), pageResult.getNumber());

        PagedDTO<List<ContentDTO>> res = PagedDTO.<List<ContentDTO>>builder()
                .content(contentDTOList).pageMetaData(pageMetaData).build();
        return res;
    }


}
