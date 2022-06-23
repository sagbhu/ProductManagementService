package com.productmanagement.service;

import java.util.List;

import com.productmanagement.model.Wishlist;
import com.productmanagement.request.WishlistRequest;

public interface WishlistService {

	Wishlist addToWishlist(WishlistRequest wishlistRequest);

	List<Wishlist> getWishlistedProducts(String userId);

	String deleteWishlistedProductById(String id);

}
