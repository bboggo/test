package com.example.toy.Controller;


import com.example.toy.Dto.comment.CommentCreateRequestDto;
import com.example.toy.Dto.comment.CommentListRequestDto;
import com.example.toy.Service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/comment")
    public Long createComment(@RequestBody CommentCreateRequestDto requestDto) {
        return commentService.create(requestDto);
    }

    @GetMapping("/comment")
    public List<CommentListRequestDto> searchAllDesc() {
        return commentService.searchAllDesc();
    }
}
