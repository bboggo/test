package com.example.toy.Dto.comment;

import com.example.toy.domain.member.Board;
import com.example.toy.domain.member.Comment;
import lombok.Getter;

@Getter
public class CommentListRequestDto {
    private Long id;
    private String content;

    private Long boardId;

    public CommentListRequestDto(Comment entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.boardId = entity.getBoard() != null ? entity.getBoard().getId() : null;
    }
}
