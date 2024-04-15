package com.ume.jpapaging.model.service;

import com.ume.jpapaging.model.dto.ContentDTO;
import com.ume.jpapaging.model.respository.ContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ContentService {
    private final ContentRepository contentRepository;

    public List<ContentDTO> getContentList(Pageable pageable) {
        List<ContentDTO> allContentDTO = contentRepository.findAllContentDTO(pageable);

        return allContentDTO;
    }


}
