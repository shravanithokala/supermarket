package com.supermarketdemo.lambton.repository;

import com.supermarketdemo.lambton.model.Customer;
import com.supermarketdemo.lambton.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @project lambton
 */

public interface DepartmentRepository extends JpaRepository<Department, Long>{
}
