package com.example.toy.Dto.comment;


import com.example.toy.domain.member.Board;
import com.example.toy.domain.member.Comment;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
public class CommentCreateRequestDto {
    private Board board;
    private String content;

    public CommentCreateRequestDto(Board board, String content) {

        this.board = board;
        this.content = content;
    }

    public Comment toEntity() {
        return new Comment(board, content);
    }
}
