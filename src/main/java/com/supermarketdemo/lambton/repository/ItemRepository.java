package com.supermarketdemo.lambton.repository;

import com.supermarketdemo.lambton.model.Customer;
import com.supermarketdemo.lambton.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @project lambton
 */

public interface ItemRepository extends JpaRepository<Item, Long>{
}
