package com.example.section3restart.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberPostDto {
    private String email;
    private String name;
    private String phone;

    public MemberPostDto(String email, String name, String phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }
}
