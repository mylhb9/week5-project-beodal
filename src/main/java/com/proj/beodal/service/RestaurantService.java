package com.proj.beodal.service;


import com.proj.beodal.domain.Restaurant;
import com.proj.beodal.dto.RestaurantDto;
import com.proj.beodal.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    private RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    //전체 음식점 리스트 조회하기
    public List<Restaurant> getAllRestaurant() {
        return restaurantRepository.findAll();
    }

    //음식점 저장하기
    public void registRestaurant(RestaurantDto restaurantDto) {
        Restaurant restaurant = new Restaurant(restaurantDto);
        restaurantRepository.save(restaurant);
    }

    //음식점 상세조회
    public Restaurant getRestaurant(Long id) {
        return restaurantRepository.findById(id).orElseThrow(
                ()->new IllegalArgumentException("존재하지 않는 음식점입니다."));
    }


}
