package com.example.section3restart.test;

import com.example.section3restart.coffee.Coffee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/request")
public class RequestHeadercontroller {
    @PostMapping
    public ResponseEntity postCoffee(@RequestHeader("user-agent") String userAgent,
                                     @RequestParam("kor") String kor,
                                     @RequestParam("eng") String eng,
                                     @RequestParam("price") int price) {
        System.out.println("user-aget :" + userAgent);
        return new ResponseEntity<>(new Coffee(kor, eng, price),
                HttpStatus.CREATED);
    }
}
