package com.proj.beodal.dto;


import com.proj.beodal.domain.Food;
import com.proj.beodal.domain.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;


@ToString
@Getter
@AllArgsConstructor
public class RestaurantDto {
    private String name;
    private String content;
    private Long minorderprice;
    private Long deliveryfee;
    private List<Food> foodList;
    private Long orderId;

}
