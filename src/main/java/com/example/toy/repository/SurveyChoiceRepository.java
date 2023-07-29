package com.example.toy.repository;

import com.example.toy.domain.member.SurveyChoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurveyChoiceRepository extends JpaRepository<SurveyChoice, Long> {
    List<SurveyChoice> findBySurveyId(Long id);
}
