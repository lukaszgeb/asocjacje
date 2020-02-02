package com.akademia.asocjacje.data;


import com.akademia.asocjacje.model.quiz.Answer;
import com.akademia.asocjacje.model.quiz.Question;
import com.akademia.asocjacje.model.quiz.Test;
import com.akademia.asocjacje.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QuizData implements CommandLineRunner {


    @Autowired
    TestRepository testRepository;


    @Override
    public void run(String... args) throws Exception {
    }
}
