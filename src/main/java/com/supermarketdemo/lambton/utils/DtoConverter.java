package com.supermarketdemo.lambton.utils;

import com.supermarketdemo.lambton.dto.CustomerDto;
import com.supermarketdemo.lambton.dto.OrderDto;
import com.supermarketdemo.lambton.model.Customer;
import com.supermarketdemo.lambton.model.Order;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @project lambton
 */

public class DtoConverter {

    public static CustomerDto convertCustomerToDto(Customer customer){
        CustomerDto customerDto = CustomerDto.builder().build();
        BeanUtils.copyProperties(customer, customerDto);
        return customerDto;
    }

    public static Customer convertDtoToCustomer(CustomerDto customerDto){
        Customer customer = Customer.builder().build();
        BeanUtils.copyProperties(customerDto, customer);
        return customer;
    }

    public static List<CustomerDto> convertCustomersToDto(List<Customer> customers){
        List<CustomerDto> customerDtos = new ArrayList<>();
        for(Customer customer : customers ){
            customerDtos.add(convertCustomerToDto(customer));
        }
        return customerDtos;
    }

//    Orders

    public static OrderDto convertOrderToDto(Order order){
        OrderDto orderDto = OrderDto.builder().build();
        BeanUtils.copyProperties(order, orderDto);
        return orderDto;
    }

    public static List<OrderDto> convertOrdersToDtoList(List<Order> orders){
        List<OrderDto> orderDtos = new ArrayList<>();
        for(Order order : orders ){
            orderDtos.add(convertOrderToDto(order));
        }
        return orderDtos;
    }
}
