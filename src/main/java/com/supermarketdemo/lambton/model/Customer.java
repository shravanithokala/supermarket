package com.supermarketdemo.lambton.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @project lambton
 */
@Entity
@Table(name="l_customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;
    private String firstName;
    private String lastName;
    private Date dob;
    private String phone;
    private String address;
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders = new ArrayList<>();
}
