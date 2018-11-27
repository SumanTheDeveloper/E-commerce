package com.niit.DAO;

import java.util.List;

import com.niit.Model.CartItem;
import com.niit.Model.CustomerOrder;

public interface CartItemDAO
{
	void addToCart(CartItem cartItem);
    void removeCartItem(int cartItemId);
    List<CartItem> getCart(String email);
    CustomerOrder createCustomerOrder(CustomerOrder customerOrder);
}
