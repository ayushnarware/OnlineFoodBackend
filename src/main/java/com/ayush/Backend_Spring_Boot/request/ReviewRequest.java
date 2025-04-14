package com.ayush.Backend_Spring_Boot.request;

import lombok.Data;

@Data
public class ReviewRequest {

    private Long restaurantId;

    private double rating;

    private String reviewText;


}