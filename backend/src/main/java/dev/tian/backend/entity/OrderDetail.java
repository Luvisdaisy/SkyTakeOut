package dev.tian.backend.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail
{
    private Long id;

    private String name;

    private String image;

    private Long orderId;

    private Long dishId;

    private Long setMealId;

    private String dishFlavor;

    private Integer number;

    private Double amount;
}
