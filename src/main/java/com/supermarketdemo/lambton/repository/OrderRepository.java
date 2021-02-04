package com.supermarketdemo.lambton.repository;

import com.supermarketdemo.lambton.model.Customer;
import com.supermarketdemo.lambton.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @project lambton
 */

public interface OrderRepository extends JpaRepository<Order, Long>{
}
