package com.ayush.Backend_Spring_Boot.service;

import com.ayush.Backend_Spring_Boot.Exception.CartException;
import com.ayush.Backend_Spring_Boot.Exception.CartItemException;
import com.ayush.Backend_Spring_Boot.Exception.FoodException;
import com.ayush.Backend_Spring_Boot.Exception.UserException;
import com.ayush.Backend_Spring_Boot.model.Cart;
import com.ayush.Backend_Spring_Boot.model.CartItem;
import com.ayush.Backend_Spring_Boot.request.AddCartItemRequest;

public interface CartSerive {

    public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

    public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

    public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

    public Long calculateCartTotals(Cart cart) throws UserException;

    public Cart findCartById(Long id) throws CartException;

    public Cart findCartByUserId(Long userId) throws CartException, UserException;

    public Cart clearCart(Long userId) throws CartException, UserException;




}
