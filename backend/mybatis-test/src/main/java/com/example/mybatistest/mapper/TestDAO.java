package com.example.mybatistest.mapper;

import com.example.mybatistest.model.Test;
import com.example.mybatistest.model.UpdateTestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestDAO {
    List<Test> getListTest(String name);

    int insertTest(Test test);

    boolean deleteTest(int id);
    boolean updateTest(UpdateTestDTO testDTO);
}
