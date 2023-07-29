package com.example.toy.Dto.survey;

import com.example.toy.domain.member.Survey;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class SurveyResponseDto {

    private Long id;
    private String member;
    private String s_text;
    private LocalDateTime s_start_date;
    private LocalDateTime s_end_date;
    private String s_state;



    private Long sc_id;
    private String sc_text;
    private Integer sc_votes;

    public SurveyResponseDto(Survey entity) {
        this.id = entity.getId();
        this.member = entity.getMember().getName();
        this.s_text = entity.getS_text();
        this.s_start_date = entity.getS_start_date();
        this.s_end_date = entity.getS_end_date();
        this.s_state = entity.getS_state();

    }

    public void addSurveyChoice(SurveyChoiceResponseDto surveyChoiceResponseDto) {
        this.sc_id = surveyChoiceResponseDto.getId();
        this.sc_text = surveyChoiceResponseDto.getSc_text();
        this.sc_votes = surveyChoiceResponseDto.getSc_votes();
    }


}

