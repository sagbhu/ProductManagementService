package com.productmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.constant.URLConstants;
import com.productmanagement.model.ShoppingCart;
import com.productmanagement.service.ShoppingCartService;

@RestController
@RequestMapping(URLConstants.ShoppingCart_URL)
public class ShoppingCartController {

	@Autowired
	ShoppingCartService shoppingCartService;

	@PostMapping("/addToCart")
	public ResponseEntity<ShoppingCart> addToCart(@RequestBody ShoppingCart shoppingcart) {
		ShoppingCart newShoppingCart = shoppingCartService.addToCart(shoppingcart);
		return new ResponseEntity<>(newShoppingCart, HttpStatus.CREATED);
	}

	@GetMapping("/getCartProducts")
	public ResponseEntity<List<ShoppingCart>> getCartProducts() {
		List<ShoppingCart> cartProducts = shoppingCartService.getCartProducts();
		return new ResponseEntity<>(cartProducts, HttpStatus.OK);
	}
	
	@GetMapping("/getUserCartProducts/{userId}")
	public ResponseEntity<List<ShoppingCart>> getUserCartProducts(@PathVariable("userId") String userId) {
		List<ShoppingCart> cartProducts = shoppingCartService.getUseCartProducts(userId);
		return new ResponseEntity<>(cartProducts, HttpStatus.OK);
	}

	@DeleteMapping("/deleteCartProduct/{id}")
	public ResponseEntity<HttpStatus> deleteCartProduct(@PathVariable("id") String id) {
		shoppingCartService.deleteCartProductById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/updateCartProduct")
	public ResponseEntity<ShoppingCart> updateCartProduct(@RequestBody ShoppingCart shoppingCart) {
		ShoppingCart newShoppingCart = shoppingCartService.updateCartProduct(shoppingCart);
		return new ResponseEntity<>(newShoppingCart, HttpStatus.OK);
	}
}
