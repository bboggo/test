package com.example.toy.repository;

import com.example.toy.domain.member.Board;
import com.example.toy.domain.member.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByOrderByIdDesc();
}