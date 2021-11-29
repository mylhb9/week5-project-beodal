package com.proj.beodal.controller;


import com.proj.beodal.dto.OrderDto;
import com.proj.beodal.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    //해당 음식점, 음식물 리스트에서 주문하기
    @PostMapping("/restaurant/{rid}/order")
    public String registOrder(OrderDto orderDto) {
        orderService.getOrder(orderDto);
        return "myorderlist";
    }



}
