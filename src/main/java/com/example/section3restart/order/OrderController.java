package com.example.section3restart.order;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {

    //주문 정보 생성
    @PostMapping
    public ResponseEntity postOrder(@RequestBody OrderPostDto orderPostDto
                                    ){
        Map<String,Object> map = new HashMap<>();


        return new ResponseEntity<>(map,HttpStatus.CREATED);
    }

    //주문 정보 변경
    @PatchMapping("/{order-id}")
    public ResponseEntity patchOrder(@PathVariable String orderId,
                                     @RequestBody OrderPatchDto orderPatchDto) {
        return null;

    }

    @GetMapping("/{order-id}")
    public ResponseEntity getOrder(@PathVariable("order-id") Long orderId) {

        System.out.println("#orderId : " + orderId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getOrders() {
        System.out.println("#get Orders");
        return new ResponseEntity<>(HttpStatus.OK);
    }


}