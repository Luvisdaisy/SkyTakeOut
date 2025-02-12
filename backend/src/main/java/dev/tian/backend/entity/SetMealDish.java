package dev.tian.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SetMealDish
{
    private Long id;

    private Long setMealId;

    private Long dishId;

    private String name;

    private Double price;

    private Integer copies;
}
