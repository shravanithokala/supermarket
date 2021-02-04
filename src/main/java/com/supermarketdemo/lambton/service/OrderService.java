package com.supermarketdemo.lambton.service;

import com.supermarketdemo.lambton.dto.CustomerDto;
import com.supermarketdemo.lambton.dto.OrderDto;

import java.util.List;

/**
 * @project lambton
 */

public interface OrderService {

    List<OrderDto> getCustomersOrders();

    OrderDto saveOrder(OrderDto orderDto) throws Exception;

}
