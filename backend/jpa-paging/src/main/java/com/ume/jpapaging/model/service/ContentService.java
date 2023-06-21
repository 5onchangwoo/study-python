package com.ume.jpapaging.model.service;

import com.ume.jpapaging.model.dto.ContentDTO;
import com.ume.jpapaging.model.respository.ContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContentService {
    private final ContentRepository contentRepository;

    public Page<ContentDTO> getContentList(Pageable pageable) {
        Page<ContentDTO> allContentDTO = contentRepository.findAllContentDTO(pageable);

        return allContentDTO;
    }


}
