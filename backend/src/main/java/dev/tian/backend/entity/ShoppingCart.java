package dev.tian.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart
{
    private Long id;

    private String name;

    private String image;

    private Long userId;

    private Long dishId;

    private Long setMealId;

    private String dishFlavor;

    private Integer number;

    private Double amount;

    private LocalDateTime createTime;
}
