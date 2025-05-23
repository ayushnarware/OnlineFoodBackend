package com.ayush.Backend_Spring_Boot.service;

import java.util.List;

import com.ayush.Backend_Spring_Boot.Exception.RestaurantException;
import com.ayush.Backend_Spring_Boot.model.IngredientCategory;
import com.ayush.Backend_Spring_Boot.model.IngredientsItem;
public interface IngredientsService {

    public IngredientCategory createIngredientsCategory(
            String name,Long restaurantId) throws RestaurantException;

    public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

    public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;

    public List<IngredientsItem> findRestaurantsIngredients(
            Long restaurantId);


    public IngredientsItem createIngredientsItem(Long restaurantId,
                                                 String ingredientName,Long ingredientCategoryId) throws Exception;

    public IngredientsItem updateStoke(Long id) throws Exception;

}
