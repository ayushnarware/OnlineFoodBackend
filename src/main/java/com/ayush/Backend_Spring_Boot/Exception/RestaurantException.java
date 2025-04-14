package com.ayush.Backend_Spring_Boot.Exception;

public class RestaurantException extends Exception {
    private static final long serialVersionUID = 1L;
    public RestaurantException(String message) {
        super(message);
    }
}