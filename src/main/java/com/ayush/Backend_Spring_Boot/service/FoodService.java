package com.ayush.Backend_Spring_Boot.service;

import java.util.List;
import com.ayush.Backend_Spring_Boot.Exception.FoodException;
import com.ayush.Backend_Spring_Boot.Exception.RestaurantException;
import com.ayush.Backend_Spring_Boot.model.Category;
import com.ayush.Backend_Spring_Boot.model.Food;
import com.ayush.Backend_Spring_Boot.model.Restaurant;
import com.ayush.Backend_Spring_Boot.request.CreateFoodRequest;

public interface FoodService {

    public Food createFood(CreateFoodRequest req,Category category,
                           Restaurant restaurant) throws FoodException, RestaurantException;

    void deleteFood(Long foodId) throws FoodException;

    public List<Food> getRestaurantsFood(Long restaurantId,
                                         boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId) throws FoodException;

    public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
