package com.supermarketdemo.lambton.controller;

import com.supermarketdemo.lambton.dto.CustomerDto;
import com.supermarketdemo.lambton.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @project lambton
 */

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping(path = {"/customers"})
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/all")
    public List<CustomerDto> getAllCustomers(){

        return customerService.getAllcustomers();
    }

    @GetMapping("/all/{customerId}")
    public CustomerDto getCustomerById(@PathVariable Long customerId) throws Exception {
        return customerService.getCustomerById(customerId);
    }

    @PostMapping("/save")
    public CustomerDto saveCustomer(@RequestBody CustomerDto customerDto) throws Exception {
        return customerService.addCustomer(customerDto);
    }

    @PutMapping("/update")
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto) throws Exception {
        return customerService.updateCustomer(customerDto);
    }

    @DeleteMapping("/delete/{customerId}")
    public String deleteCustomer(@PathVariable Long customerId) throws Exception {
        return customerService.deleteCustomer(customerId);
    }
}
