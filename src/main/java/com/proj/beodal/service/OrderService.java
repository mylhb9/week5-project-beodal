package com.proj.beodal.service;

import com.proj.beodal.domain.Order;
import com.proj.beodal.domain.Restaurant;
import com.proj.beodal.dto.OrderDto;
import com.proj.beodal.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    //주문처리
    public void getOrder(OrderDto orderDto) {
        Order order = new Order(orderDto);
        orderRepository.save(order);
    }




}
