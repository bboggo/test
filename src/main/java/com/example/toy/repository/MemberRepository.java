package com.example.toy.repository;

import com.example.toy.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findAllByOrderByIdDesc();

    Optional<Member> findByEmailAndPassword(String email, String password);
}