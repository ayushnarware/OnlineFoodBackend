package com.ayush.Backend_Spring_Boot.service;
import java.util.List;

import com.ayush.Backend_Spring_Boot.Exception.RestaurantException;
import com.ayush.Backend_Spring_Boot.model.Category;

public interface CategoryService {

    public Category createCategory (String name,Long userId) throws RestaurantException;
    public List<Category> findCategoryByRestaurantId(Long restaurantId) throws RestaurantException;
    public Category findCategoryById(Long id) throws RestaurantException;

}
