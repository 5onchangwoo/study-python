package com.ume.jpapaging.model.respository;

import com.ume.jpapaging.model.dto.ContentDTO;
import com.ume.jpapaging.model.entity.Content;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer> {

    @Query("select new com.ume.jpapaging.model.dto.ContentDTO(c.title, c.detail) from Content c")
    List<ContentDTO> findAllContentDTO(Pageable pageable);
}
