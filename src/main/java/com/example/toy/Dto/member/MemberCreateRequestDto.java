package com.example.toy.Dto.member;

import com.example.toy.domain.member.Board;
import com.example.toy.domain.member.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemberCreateRequestDto {


    private String name;
    private String password;
    private String email;
    private String contact;

    @Builder
    public MemberCreateRequestDto(String name, String password, String email, String contact) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.contact = contact;
    }

    public Member toEntity() {

        return new Member(name, password, email, contact);
    }


}
