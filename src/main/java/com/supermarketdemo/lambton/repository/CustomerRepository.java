package com.supermarketdemo.lambton.repository;

import com.supermarketdemo.lambton.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @project lambton
 */

public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
