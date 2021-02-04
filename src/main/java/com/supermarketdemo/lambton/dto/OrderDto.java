package com.supermarketdemo.lambton.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.supermarketdemo.lambton.model.Item;
import com.supermarketdemo.lambton.model.Payment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @project lambton
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrderDto {
    private Long customerId;
    private Long orderId;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date orderDate;

    private List<Item> orderItems;
    private List<Payment> payments;
}
