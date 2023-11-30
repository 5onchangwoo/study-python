package com.example.mybatistest.service;


import com.example.mybatistest.mapper.TestDAO;
import com.example.mybatistest.model.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class JspService {
    private final TestDAO testDAO;

    @Transactional
    public int insertTest(Test test) {
        if(testDAO.isExistName(test.getName())) return -1;
        int id = testDAO.insertTest(test);
        return id;

    }
}
