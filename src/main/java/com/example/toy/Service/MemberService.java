package com.example.toy.Service;

import com.example.toy.Dto.member.MemberCreateRequestDto;
import com.example.toy.domain.member.Member;
import com.example.toy.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;


    @Transactional
    public Long create(MemberCreateRequestDto requestDto) {
        return memberRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public boolean login(MemberCreateRequestDto requestDto) {
        Optional<Member> optionalMember = memberRepository.findByEmailAndPassword(requestDto.getEmail(), requestDto.getPassword());
        return optionalMember.isPresent();
    }
}
