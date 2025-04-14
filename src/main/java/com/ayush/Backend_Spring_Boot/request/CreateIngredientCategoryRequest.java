package com.ayush.Backend_Spring_Boot.request;

import lombok.Data;

@Data
public class CreateIngredientCategoryRequest {

    private Long restaurantId;
    private String name;
}
