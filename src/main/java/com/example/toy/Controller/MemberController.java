package com.example.toy.Controller;

import com.example.toy.Dto.member.MemberCreateRequestDto;
import com.example.toy.Service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@RestController
public class MemberController {
    private final MemberService memberService;


    @PostMapping("/join")
    public Long createMember(@RequestBody MemberCreateRequestDto requestDto) {
        return memberService.create(requestDto);
    }

    @PostMapping("/login")
    public String login(@RequestBody MemberCreateRequestDto requestDto, HttpServletRequest request) {
        HttpSession session = request.getSession();
        boolean loginResult = memberService.login(requestDto);

        if (loginResult) {
            session.setAttribute("loggedIn", true);
            return "Login Successful";
        } else {
            session.setAttribute("loggedIn", false);
            return "Login Failed";
        }
    }

}
