package com.example.toy.Dto.board;

import com.example.toy.domain.member.Board;
import com.example.toy.domain.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
public class BoardCreateRequestDto {
    private Member member;
    private String title;
    private String content;
    private Integer likeCount;

    public BoardCreateRequestDto(Member member, String title, String content, Integer likeCount) {
        this.member = member;
        this.title = title;
        this.content = content;
    }

    public Board toEntity() {
        return new Board(member, title, content, likeCount);
    }
}