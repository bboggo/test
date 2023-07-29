package com.example.toy.Service;


import com.example.toy.Dto.comment.CommentCreateRequestDto;
import com.example.toy.Dto.comment.CommentListRequestDto;
import com.example.toy.domain.member.Comment;
import com.example.toy.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CommentService {
    private final CommentRepository commentRepository;

    private Comment entity;

    @Transactional
    public Long create(CommentCreateRequestDto requestDto) {
        return commentRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public List<CommentListRequestDto> searchAllDesc() {
        return commentRepository.findAll(Sort.by(Sort.Direction.DESC, "id")).stream()
                .map(CommentListRequestDto::new)
                .collect(Collectors.toList());
    }
}
