package com.akademia.asocjacje.controller;

import com.akademia.asocjacje.dto.TestDto;
import com.akademia.asocjacje.dto.mapper.TestMapper;
import com.akademia.asocjacje.model.quiz.Test;
import com.akademia.asocjacje.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/tests")
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestRepository testRepository;


    @GetMapping("/{id}")
    public TestDto sayHello(@PathVariable Long id){
        Test test = testRepository.findById(id).get();
        return testMapper.mapToTestDto(test);
    }
}
