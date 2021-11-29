package com.proj.beodal.domain;


import com.proj.beodal.dto.FoodDto;
import com.proj.beodal.dto.RestaurantDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@ToString
@Getter
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long foodId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long price;


    @ManyToOne
    @JoinColumn(name="restaurant_id")
    private Restaurant restaurant;


    public Food (FoodDto foodDto) {
        this.name = foodDto.getName();
        this.price = foodDto.getPrice();
        this.restaurant = foodDto.getRestaurant();
    }




}