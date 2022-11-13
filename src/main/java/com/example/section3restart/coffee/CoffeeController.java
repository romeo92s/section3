package com.example.section3restart.coffee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/coffees")
public class CoffeeController {

    @PostMapping
     public ResponseEntity postCoffee(@RequestParam("korName")String korName,
                                      @RequestParam("engName")String engName,
                                      @RequestParam("price")String price){
        Map<String,String> map = new HashMap<>();
        map.put("korName", korName);
        map.put("engName", engName);
        map.put("price", price);

        return new ResponseEntity<>(map, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity getCoffee(@PathVariable("member-id") long memberId) {
        System.out.println("#memberId :" + memberId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity getCoffees(){
        System.out.println("#get Members");
        return new ResponseEntity<>(HttpStatus.OK);
        // 왜 new ResponseEntity를 썻나
    }
}
