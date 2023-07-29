package com.example.toy.domain.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "board")
@Setter

public class Board {
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Member.class)
    @JoinColumn(name = "member_id", updatable = false)
    private Member member;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(name = "like_count")
    private Integer likeCount;

//    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Heart> hearts = new ArrayList<>();

    @Builder
    public Board(Member member, String title, String content,Integer likeCount) {
        this.member = member;
        this.title = title;
        this.content = content;
        this.likeCount = likeCount;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}