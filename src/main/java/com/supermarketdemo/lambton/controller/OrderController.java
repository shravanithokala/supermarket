package com.supermarketdemo.lambton.controller;

import com.supermarketdemo.lambton.dto.CustomerDto;
import com.supermarketdemo.lambton.dto.OrderDto;
import com.supermarketdemo.lambton.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @project lambton
 */

@RestController
@RequestMapping(path = {"/order"})
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }


    @GetMapping("/all/{customerId}")
    public List<OrderDto> getCustomersOrders(){
        return orderService.getCustomersOrders();
    }

    @PostMapping("/save")
    public OrderDto saveCustomer(@RequestBody OrderDto customerDto) throws Exception {
        return orderService.saveOrder(customerDto);
    }

}
