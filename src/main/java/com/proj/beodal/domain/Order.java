package com.proj.beodal.domain;

import com.proj.beodal.dto.FoodDto;
import com.proj.beodal.dto.OrderDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@ToString
@Getter
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="orderss")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;


    private Long restaurantId;

    @Column
    private Long totalprice;

    public Order (OrderDto orderDto) {
        this.user = orderDto.getUser();
        this.restaurantId = orderDto.getRestaurantId();
        this.totalprice = orderDto.getTotalprice();

    }




}
