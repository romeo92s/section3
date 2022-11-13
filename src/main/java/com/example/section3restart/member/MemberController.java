package com.example.section3restart.member;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/members")
public class MemberController {

    @PostMapping
    public ResponseEntity postMember(@RequestParam("email") String email,
                                     @RequestParam("name") String name,
                                     @RequestParam("phone") String phone) {
        //HashMap은 map인터페이스를 구현한 대표적인 클래스이다 HashMAp은
        Map<String,String> map = new HashMap<>(); //map은 <키,값(value)>으로 구성된 객체를 저장하는 구조를 가지고있다.
        map.put("email", email);
        map.put("name", name);
        map.put("phone", phone);

        return new ResponseEntity<>(map, HttpStatus.CREATED);

    }

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") long memberId) {
        System.out.println("# memberId :" + memberId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity getMembers() {
        System.out.println("# get Members");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
