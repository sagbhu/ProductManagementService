package com.productmanagement.response;

import java.util.List;

import com.productmanagement.model.Product;

public class OrderProductsResponse {

	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
