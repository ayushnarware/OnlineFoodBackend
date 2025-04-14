package com.ayush.Backend_Spring_Boot.request;
import com.ayush.Backend_Spring_Boot.model.Address;
import lombok.Data;
@Data
public class CreateOrderRequest {
    private Long restaurantId;
    private Address deliveryAddress;
}