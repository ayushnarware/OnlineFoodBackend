package com.ayush.Backend_Spring_Boot.service;

import com.ayush.Backend_Spring_Boot.Exception.RestaurantException;
import com.ayush.Backend_Spring_Boot.dto.RestaurantDto;
import com.ayush.Backend_Spring_Boot.model.Restaurant;
import com.ayush.Backend_Spring_Boot.model.User;
import com.ayush.Backend_Spring_Boot.request.CreateRestaurantRequest;
import java.util.List;

public interface RestaurantService {

    public Restaurant createRestaurant(CreateRestaurantRequest req,User user);

    public Restaurant updateRestaurant(Long restaurantId, CreateRestaurantRequest updatedRestaurant)
            throws RestaurantException;

    public void deleteRestaurant(Long restaurantId) throws RestaurantException;

    public List<Restaurant>getAllRestaurant();

    public List<Restaurant>searchRestaurant(String keyword);

    public Restaurant findRestaurantById(Long id) throws RestaurantException;

    public Restaurant getRestaurantsByUserId(Long userId) throws RestaurantException;

    public RestaurantDto addToFavorites(Long restaurantId,User user) throws RestaurantException;

    public Restaurant updateRestaurantStatus(Long id)throws RestaurantException;
}
