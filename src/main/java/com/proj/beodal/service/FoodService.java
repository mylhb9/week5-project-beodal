package com.proj.beodal.service;


import com.proj.beodal.domain.Food;
import com.proj.beodal.dto.FoodDto;
import com.proj.beodal.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodService {
    private final FoodRepository foodRepository;
    @Autowired
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }
    public void getFood(FoodDto foodDto) {
        Food food = new Food(foodDto);
        foodRepository.save(food);
    }
}
