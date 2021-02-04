package com.supermarketdemo.lambton.repository;

import com.supermarketdemo.lambton.model.Customer;
import com.supermarketdemo.lambton.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @project lambton
 */

public interface PaymentRepository extends JpaRepository<Payment, Long>{
}
