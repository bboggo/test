package com.example.toy.Controller;

import com.example.toy.Dto.board.BoardCreateRequestDto;
import com.example.toy.Dto.board.BoardListResponseDto;
import com.example.toy.Dto.board.BoardResponseDto;
import com.example.toy.Dto.board.BoardUpdateRequestDto;
import com.example.toy.Dto.comment.CommentCreateRequestDto;
import com.example.toy.Service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    @PostMapping("/board")
    public Long createBoard(@RequestBody BoardCreateRequestDto requestDto) {
        return boardService.create(requestDto);
    }

    @PutMapping("/board/{id}")
    public Long update(@PathVariable Long id, @RequestBody BoardUpdateRequestDto requestDto) {
        return boardService.update(id, requestDto);
    }

    //개별 조회
    @GetMapping("/board/{id}")
    public BoardResponseDto searchById(@PathVariable Long id) {
        return boardService.searchById(id);
    }

    //전체 조회(목록)
    @GetMapping("/board")
    public List<BoardListResponseDto> searchAllDesc() {
        return boardService.searchAllDesc();
    }

    @DeleteMapping("/board/{id}")
    public void delete(@PathVariable Long id){
        boardService.delete(id);
    }
}
