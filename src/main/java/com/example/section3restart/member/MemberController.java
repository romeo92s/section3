package com.example.section3restart.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;


@RestController
@RequestMapping("/v1/members")
public class MemberController {

    //회원정보 등록
    @PostMapping
    public ResponseEntity postMember(@Valid @RequestBody MemberPostDto memberDto) {
        //HashMap은 map인터페이스를 구현한 대표적인 클래스이다 HashMAp은

        return new ResponseEntity<>(memberDto,HttpStatus.CREATED);

    }

    //회원 정보 수정
    @PatchMapping("/{member-id}")
    public ResponseEntity patchMember(@PathVariable("member-id") @Min(1) Long memberId,
                                      @RequestBody MemberPatchDto memberPatchDto) {
        memberPatchDto.setMemberId(memberId);
        memberPatchDto.setName("홍길동");
        return new ResponseEntity<>(memberPatchDto, HttpStatus.OK);
    }
    //한명의 회원 정보 조회
    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") long memberId) {
        System.out.println("# memberId :" + memberId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //모든 회원 정보 조회
    @GetMapping
    public ResponseEntity getMembers() {
        System.out.println("# get Members");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //회원 정보 삭제
    @DeleteMapping("/{member-id}")
    public ResponseEntity deleteMember(@PathVariable("member-id") long memberId) {
        System.out.println("# memberId : " + memberId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
