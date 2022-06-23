package com.productmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.constant.URLConstants;
import com.productmanagement.model.ProductLike;
import com.productmanagement.service.ProductLikesService;

@RestController
@RequestMapping(URLConstants.PRODUCT_LIKES_URL)
public class ProductLikesController {
	@Autowired
	ProductLikesService productLikesService;

	@PostMapping("/saveProductLike")
	public ResponseEntity<ProductLike> saveProductLike(@RequestBody ProductLike productLike) {
		return new ResponseEntity<>(productLikesService.saveProductLike(productLike), HttpStatus.CREATED);
	}

}
