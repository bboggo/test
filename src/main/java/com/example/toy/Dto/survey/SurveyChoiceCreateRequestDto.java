package com.example.toy.Dto.survey;

import com.example.toy.domain.member.Member;
import com.example.toy.domain.member.Survey;
import com.example.toy.domain.member.SurveyChoice;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SurveyChoiceCreateRequestDto {

    Member member;
    Survey survey;
    String sc_text;
    Integer sc_votes;
    String sc_person;
    public SurveyChoiceCreateRequestDto(Member member, Survey survey, String sc_text, Integer sc_votes, String sc_person) {
        this.member = member;
        this.survey = survey;
        this.sc_text = sc_text;
        this.sc_votes = sc_votes;
        this.sc_person = sc_person;
    }
    public SurveyChoice toEntity() {
        return new SurveyChoice(member, survey, sc_text, sc_votes, sc_person);
    }
}
