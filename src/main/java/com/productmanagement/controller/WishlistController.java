package com.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.constant.URLConstants;
import com.productmanagement.model.Wishlist;
import com.productmanagement.request.WishlistRequest;
import com.productmanagement.service.WishlistService;

@RestController
@RequestMapping(URLConstants.WISHLIST_URL)
public class WishlistController {

	@Autowired
	WishlistService wishlistService;

	@PostMapping("/addToWishlist")
	public ResponseEntity<Wishlist> addToWishlist(@RequestBody WishlistRequest wishlistRequest) {
		Wishlist wishlistObj = wishlistService.addToWishlist(wishlistRequest);
		return new ResponseEntity<>(wishlistObj, HttpStatus.CREATED);
	}

	@GetMapping("/goToWishlist/{userId}")
	public ResponseEntity<List<Wishlist>> getWishlistedProducts(@PathVariable("userId") String userId) {
		List<Wishlist> wishlistedProducts = wishlistService.getWishlistedProducts(userId);
		return new ResponseEntity<>(wishlistedProducts, HttpStatus.OK);
	}

	@DeleteMapping("/deleteWishlistedProduct/{id}")
	public ResponseEntity<String> deleteWishlistedProductById(@PathVariable("id") String id) {
		String status = wishlistService.deleteWishlistedProductById(id);
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
