package com.productmanagement.service;

import java.util.List;

import com.productmanagement.model.ShoppingCart;

public interface ShoppingCartService {

	ShoppingCart addToCart(ShoppingCart shoppingCart);

	List<ShoppingCart> getCartProducts();

	void deleteCartProductById(String id);

	ShoppingCart updateCartProduct(ShoppingCart shoppingCart);
	
	List<ShoppingCart> getUseCartProducts(String userId);
}
