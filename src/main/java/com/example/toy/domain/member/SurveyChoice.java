package com.example.toy.domain.member;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "survey_choice")
public class SurveyChoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sc_id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Member.class)
    @JoinColumn(name = "member_id", updatable = false)
    private Member member;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Survey.class)
    @JoinColumn(name = "s_id", updatable = false)
    private Survey survey;

    @Column(length = 255, nullable = false)
    private String sc_text;

    @Column(nullable = false)
    private Integer sc_votes;

    @Column(length = 255, nullable = false)
    private String sc_person;

    @Builder
    public SurveyChoice(Member member, Survey survey, String sc_text, Integer sc_votes, String sc_person) {
        this.member = member;
        this.survey = survey;
        this.sc_text = sc_text;
        this.sc_votes = sc_votes;
        this.sc_person = sc_person;
    }
}
