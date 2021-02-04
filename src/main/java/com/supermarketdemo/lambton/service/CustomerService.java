package com.supermarketdemo.lambton.service;

import com.supermarketdemo.lambton.dto.CustomerDto;
import com.supermarketdemo.lambton.model.Customer;

import java.util.List;

/**
 * @project lambton
 */

public interface CustomerService {

    List<CustomerDto> getAllcustomers();

    CustomerDto getCustomerById(Long id) throws Exception;

    CustomerDto addCustomer(CustomerDto customer);

    CustomerDto updateCustomer(CustomerDto customerDto) throws Exception;

    String deleteCustomer(Long id) throws Exception;

}


