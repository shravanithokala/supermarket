package com.supermarketdemo.lambton.repository;

import com.supermarketdemo.lambton.model.Customer;
import com.supermarketdemo.lambton.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @project lambton
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
