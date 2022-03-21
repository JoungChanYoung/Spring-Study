package hello.hellospring.controller;

import hello.hellospring.repository.MemoryMemberRepository;
import hello.hellospring.service.MemberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberControllerTest {
    MemberService memberService;
    MemoryMemberRepository memberRepository;
    MemberController memberController;

    @BeforeEach
    public void beforeEach() {
        memberRepository = new MemoryMemberRepository();
        memberService = new MemberService(memberRepository);
        memberController = new MemberController(memberService);
    }

    @Test
    public void list() {

    }

}