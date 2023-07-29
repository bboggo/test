package com.example.toy.Dto.survey;

import com.example.toy.domain.member.SurveyChoice;
import lombok.Getter;

@Getter
public class SurveyChoiceResponseDto {
    private final Long id;
    private Long survey;
    private final String sc_text;

    private final Integer sc_votes;


    public SurveyChoiceResponseDto(SurveyChoice entity) {
        this.id = entity.getId();
        this.survey = entity.getSurvey().getId();
        this.sc_text = entity.getSc_text();
        this.sc_votes = entity.getSc_votes();
    }
}
