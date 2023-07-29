package com.example.toy.repository;

import com.example.toy.domain.member.Board;
import com.example.toy.domain.member.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurveyRepository extends JpaRepository<Survey, Long> {

    List<Survey> findAllByOrderByIdDesc();
}
