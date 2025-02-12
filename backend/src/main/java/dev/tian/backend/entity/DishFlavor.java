package dev.tian.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DishFlavor
{
    private Long id;

    private Long dishId;

    private String name;

    private String value;
}
