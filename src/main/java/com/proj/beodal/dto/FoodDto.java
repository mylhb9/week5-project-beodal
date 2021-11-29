package com.proj.beodal.dto;

import com.proj.beodal.domain.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;



@ToString
@Getter
@AllArgsConstructor
public class FoodDto {
    private String name;
    private Long price;
    private Restaurant restaurant;


}
