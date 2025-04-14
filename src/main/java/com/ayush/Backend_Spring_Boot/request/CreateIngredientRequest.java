package com.ayush.Backend_Spring_Boot.request;
import lombok.Data;

@Data
public class CreateIngredientRequest {

    private Long restaurantId;
    private String name;
    private Long ingredientCategoryId;
}