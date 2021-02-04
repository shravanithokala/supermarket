package com.supermarketdemo.lambton.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * @project lambton
 */
@Entity
@Table(name="l_department")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Item> items;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;
}
