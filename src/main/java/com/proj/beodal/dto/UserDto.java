package com.proj.beodal.dto;


import com.proj.beodal.domain.Order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class UserDto {
    private String username;
    private String password;
    private List<Order> orderList;


}
