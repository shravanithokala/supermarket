package com.supermarketdemo.lambton.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.supermarketdemo.lambton.model.CustomerType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @project lambton
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class CustomerDto {
    private Long customerId;
    private String firstName;
    private String lastName;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date dob;
    private String phone;
    private String address;
    private CustomerType customerType;
}
