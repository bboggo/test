package com.example.toy.Service;


import com.example.toy.Dto.board.BoardCreateRequestDto;
import com.example.toy.Dto.board.BoardResponseDto;
import com.example.toy.Dto.survey.SurveyChoiceCreateRequestDto;
import com.example.toy.Dto.survey.SurveyChoiceResponseDto;
import com.example.toy.Dto.survey.SurveyCreateRequestDto;
import com.example.toy.Dto.survey.SurveyResponseDto;
import com.example.toy.domain.member.Board;
import com.example.toy.domain.member.Survey;
import com.example.toy.domain.member.SurveyChoice;
import com.example.toy.repository.SurveyChoiceRepository;
import com.example.toy.repository.SurveyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class SurveyService {


}
