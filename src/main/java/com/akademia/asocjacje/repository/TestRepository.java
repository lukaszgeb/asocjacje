package com.akademia.asocjacje.repository;

import com.akademia.asocjacje.model.quiz.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test, Long> {



}
