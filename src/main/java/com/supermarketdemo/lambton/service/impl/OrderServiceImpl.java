package com.supermarketdemo.lambton.service.impl;

import com.supermarketdemo.lambton.dto.OrderDto;
import com.supermarketdemo.lambton.model.Customer;
import com.supermarketdemo.lambton.model.Item;
import com.supermarketdemo.lambton.model.Order;
import com.supermarketdemo.lambton.repository.CustomerRepository;
import com.supermarketdemo.lambton.repository.ItemRepository;
import com.supermarketdemo.lambton.repository.OrderRepository;
import com.supermarketdemo.lambton.service.OrderService;
import com.supermarketdemo.lambton.utils.DtoConverter;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @project lambton
 */

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private CustomerRepository customerRepository;
    private ItemRepository itemRepository;

    public OrderServiceImpl(OrderRepository orderRepository, CustomerRepository customerRepository, ItemRepository itemRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.itemRepository = itemRepository;
    }

    @Override
    public List<OrderDto> getCustomersOrders() {
        return DtoConverter.convertOrdersToDtoList(orderRepository.findAll());
    }

    @Override
    public OrderDto saveOrder(OrderDto orderDto) throws Exception {
        Customer customer = customerRepository.findById(orderDto.getCustomerId()).orElseThrow(()-> new Exception());
        Order order = Order.builder().customer(customer)
                .items(orderDto.getOrderItems())
                .payments(orderDto.getPayments())
                .orderDate(orderDto.getOrderDate()).build();
        return DtoConverter.convertOrderToDto(orderRepository.save(order));
    }
}
