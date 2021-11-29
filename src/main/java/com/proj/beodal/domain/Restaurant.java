package com.proj.beodal.domain;


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
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long restaurantId;

    @Column(nullable = false)
    private String name;

    @Column
    private String content;

    @Column(nullable = false)
    private Long minorderprice;

    @Column(nullable = false)
    private Long deliveryfee;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<Food> foodList;

    @Column
    private Long orderId;


    public Restaurant (RestaurantDto restaurantDto) {
        this.name = restaurantDto.getName();
        this.content = restaurantDto.getContent();
        this.minorderprice = restaurantDto.getMinorderprice();
        this.deliveryfee = restaurantDto.getDeliveryfee();
        this.foodList = restaurantDto.getFoodList();
        this.orderId = restaurantDto.getOrderId();
    }




}
