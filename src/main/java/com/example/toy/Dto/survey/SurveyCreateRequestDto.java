package com.example.toy.Dto.survey;

import com.example.toy.domain.member.Board;
import com.example.toy.domain.member.Member;
import com.example.toy.domain.member.Survey;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class SurveyCreateRequestDto {

    Member member;
    String s_text;
    LocalDateTime s_start_date;
    LocalDateTime s_end_date;
    String s_state;

    public SurveyCreateRequestDto(Member member, String s_text, LocalDateTime s_start_date, LocalDateTime s_end_date, String s_state) {
        this.member = member;
        this.s_text = s_text;
        this.s_start_date = s_start_date;
        this.s_end_date = s_end_date;
        this.s_state = s_state;
    }
    public Survey toEntity() {
        return new Survey(member, s_text, s_start_date, s_end_date, s_state);
    }
}
