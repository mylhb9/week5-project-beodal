package com.proj.beodal.controller;


import com.proj.beodal.dto.FoodDto;
import com.proj.beodal.repository.FoodRepository;
import com.proj.beodal.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoodController {
    private final FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }
    //해당 음식점의 음식물 등록
    @PostMapping("/restaurant/{id}/food")
    public String registFood(FoodDto foodDto) {
        foodService.getFood(foodDto);
        return "foodlist";
    }



}
