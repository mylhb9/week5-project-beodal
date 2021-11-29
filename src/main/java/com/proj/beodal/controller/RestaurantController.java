package com.proj.beodal.controller;


import com.proj.beodal.domain.Restaurant;
import com.proj.beodal.dto.RestaurantDto;
import com.proj.beodal.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    private RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }


    //전체 음식점 조회
    @GetMapping("/restaurant/list")
    public String restaurantlist(Model model) {
        List<Restaurant> restaurantList = restaurantService.getAllRestaurant();
        model.addAttribute("restaurants", restaurantList);
        return "restaurantlist";
    }
    //음식점 등록
    @PostMapping("/restaurant")
    public String registerRestaurant(@RequestBody RestaurantDto restaurantDto) {
        restaurantService.registRestaurant(restaurantDto);
        return "redirect:/restaurant/list";
    }
    //음식점 상세조회해서 음식 리스트 보기
    @GetMapping("/restaurant/{id}")
    public String foodList(@PathVariable("id") Long restaurantId, Model model) {
        Restaurant restaurant = restaurantService.getRestaurant(restaurantId);
        model.addAttribute("restaurant",restaurant);
        return "redirect:/restaurant/list";
    }



}
