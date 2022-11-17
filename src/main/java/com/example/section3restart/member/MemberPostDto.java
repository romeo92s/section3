package com.example.section3restart.member;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class MemberPostDto {

    private long id;
    @NotBlank
    private String email;

    @NotBlank
    @Pattern(regexp = "^([A-Za-z])(\\s?[A-Za-z])*$", message = "커피명은 영문이여야 합니다.")
    private String name;
    @Pattern(regexp = "^010{3}-\\d{4}-\\{4}$",
    message = " 휴대폰 번호는 0101으로 시작하는 11자리 숫자와 '-'로 구성되어야 합니다.")
    private String phone;

    public MemberPostDto(String email, String name, String phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }
}
