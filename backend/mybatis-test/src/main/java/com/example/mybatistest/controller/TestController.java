package com.example.mybatistest.controller;


import com.example.mybatistest.model.ResponseDTO;
import com.example.mybatistest.model.Test;
import com.example.mybatistest.model.UpdateTestDTO;
import com.example.mybatistest.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tests")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("")
    public ResponseEntity<ResponseDTO> getTestList(@RequestParam(required = false) String name) {
        List<Test> testList = testService.getListTest(name);
        ResponseDTO responseDTO = ResponseDTO.builder()
                .msg("성공적으로 완료하였습니다.")
                .code("0000")
                .data(testList)
                .build();
        return ResponseEntity.ok().body(responseDTO);
    }

    @PostMapping("")
    public ResponseEntity<ResponseDTO> insertTest(@RequestBody Test test) {
        int result = testService.insertTest(test);
        String msg;
        String code;
        if (result > 0) {
            msg = "성공적";
            code = "0000";
        } else {
            msg = "실패";
            code = "9999";
        }
        ResponseDTO responseDTO = ResponseDTO.builder()
                .msg(msg)
                .code(code)
                .build();

        return ResponseEntity.ok().body(responseDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteTest(@PathVariable int id) {
        boolean result = testService.deleteTest(id);
        String msg;
        String code;
        if (result) {
            msg = "성공적";
            code = "0000";
        } else {
            msg = "실패";
            code = "9999";
        }
        ResponseDTO responseDTO = ResponseDTO.builder()
                .msg(msg)
                .code(code)
                .data(id)
                .build();

        return ResponseEntity.ok().body(responseDTO);
    }

    @PutMapping(value = "/{id}", consumes = "application/json")
    public ResponseEntity<ResponseDTO> updateTest(@RequestBody Test test, @PathVariable int id) {
        UpdateTestDTO updateTestDTO = new UpdateTestDTO(id, test.getName());
        boolean result = testService.updateTest(updateTestDTO);
        String msg;
        String code;
        if (result) {
            msg = "성공적";
            code = "0000";
        } else {
            msg = "실패";
            code = "9999";
        }
        ResponseDTO responseDTO = ResponseDTO.builder()
                .msg(msg)
                .code(code)
                .data(id)
                .build();

        return ResponseEntity.ok().body(responseDTO);
    }


}
