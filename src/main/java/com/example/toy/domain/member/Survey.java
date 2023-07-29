package com.example.toy.domain.member;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "survey")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Member.class)
    @JoinColumn(name = "member_id", updatable = false)
    private Member member;

    @Column(length = 255, nullable = false)
    private String s_text;

    @Column(nullable = false)
    private LocalDateTime s_start_date;

    @Column(nullable = false)
    private LocalDateTime s_end_date;

    // 모집 여부
    @Column(length = 20, nullable = false)
    private String s_state;


    @Builder
    public Survey(Member member,  String s_text, LocalDateTime s_start_date, LocalDateTime s_end_date, String s_state) {
        this.member = member;
        this.s_text = s_text;
        this.s_start_date = s_start_date;
        this.s_end_date = s_end_date;
        this.s_state = s_state;
    }

}
