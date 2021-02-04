package com.supermarketdemo.lambton.service.impl;

import com.supermarketdemo.lambton.dto.CustomerDto;
import com.supermarketdemo.lambton.model.Customer;
import com.supermarketdemo.lambton.model.CustomerType;
import com.supermarketdemo.lambton.repository.CustomerRepository;
import com.supermarketdemo.lambton.service.CustomerService;
import com.supermarketdemo.lambton.utils.DtoConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @project lambton
 */

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDto> getAllcustomers() {
        return DtoConverter.convertCustomersToDto(customerRepository.findAll());
    }

    @Override
    public CustomerDto getCustomerById(Long id) throws Exception {
        return DtoConverter.convertCustomerToDto(customerRepository.findById(id).orElseThrow(() -> new Exception()));
    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        Customer customer = DtoConverter.convertDtoToCustomer(customerDto);
        customer.setCustomerType(getTypeEnumName(customerDto.getCustomerType().name()));
        return DtoConverter.convertCustomerToDto(customerRepository.save(customer));
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) throws Exception {
        Optional<Customer> opCustomer = customerRepository.findById(customerDto.getCustomerId());
        if(opCustomer.isPresent()){
            Customer customer = DtoConverter.convertDtoToCustomer(customerDto);
            return DtoConverter.convertCustomerToDto(customerRepository.save(customer));
        }else{
            throw new Exception();
        }
    }

    @Override
    public String deleteCustomer(Long id) throws Exception {
        Customer opCustomer = customerRepository.findById(id).orElseThrow(() -> new Exception());
        customerRepository.delete(opCustomer);
        return "Customer deleted";
    }

    private CustomerType getTypeEnumName(String customerType) {
        return CustomerType.valueOf(customerType.toUpperCase());
    }
}


