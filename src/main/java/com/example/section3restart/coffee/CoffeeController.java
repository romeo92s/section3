package com.example.section3restart.coffee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/v1/coffees")
public class CoffeeController {

    @PostMapping
    public ResponseEntity postCoffee(@RequestBody CoffeePostDto coffeePostDto) {

        return new ResponseEntity<>(coffeePostDto,HttpStatus.CREATED);
    }

    @PatchMapping("/{coffee-id}")
    public ResponseEntity patchCoffee(@PathVariable("coffee-id") long coffeeId,
                                      @RequestBody CoffeePatchDto coffeePatchDto) {
        coffeePatchDto.setKorName("아메리카노");
        coffeePatchDto.setPrice(6000);


        return new ResponseEntity(coffeePatchDto,HttpStatus.OK);
    }
    @GetMapping("/{coffee-id}")
    public ResponseEntity getCoffee(@PathVariable("coffee-id") long memberId) {
        System.out.println("#coffee :" + memberId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity getCoffees(){
        System.out.println("#get Members");
        return new ResponseEntity<>(HttpStatus.OK);
        // 왜 new ResponseEntity를 썻나
    }
}
