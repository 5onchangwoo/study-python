package com.example.mybatistest.service;

import com.example.mybatistest.mapper.TestDAO;
import com.example.mybatistest.model.Test;
import com.example.mybatistest.model.UpdateTestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final TestDAO testDAO;

    public List<Test> getListTest(String name) {
        List<Test> result = testDAO.getListTest(name);
        return result;
    }

    @Transactional
    public int insertTest(Test test){
        int result = testDAO.insertTest(test);
        return result;
    }

    @Transactional
    public boolean deleteTest(int id){
        return testDAO.deleteTest(id);
    }

    @Transactional
    public boolean updateTest(UpdateTestDTO updateTestDTO){
        return testDAO.updateTest(updateTestDTO);
    }

}
