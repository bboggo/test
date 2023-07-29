package com.example.toy.domain.member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "comment")

public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.MERGE, targetEntity = Board.class)
    @JoinColumn(name = "board_id", updatable = false)
    private Board board;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Builder
    public Comment(Board board, String content) {
        this.board = board;
        this.content = content;
    }
}
