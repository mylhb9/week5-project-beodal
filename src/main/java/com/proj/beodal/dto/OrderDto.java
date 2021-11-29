package com.proj.beodal.dto;

import com.proj.beodal.domain.Restaurant;
import com.proj.beodal.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class OrderDto {
    private Long restaurantId;
    private User user;
    private Long totalprice;


}