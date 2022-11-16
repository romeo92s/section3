package com.example.section3restart.coffee;

import lombok.AllArgsConstructor;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
public class CoffeePatchDto {

    private long coffeeId;
    @NotBlank
    public String korName;
    @Pattern(regexp = "^([A-Za-z]\\s?)*$", message = "커피명(영문)은 영문이어야 합니다. 예) Cafe Latte")
    @NotBlank
    public String engName;
    @Range(min = 100, max =50000)
    public int price;

    public long getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getKorName() {
        return korName;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
