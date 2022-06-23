package com.productmanagement.service;

import java.util.List;

import com.productmanagement.model.ProductSlug;
import com.productmanagement.request.ProductSlugRequest;

public interface ProductSlugService {

	// Save operation
	ProductSlug createProductSlug(ProductSlug productSlug);

	// Read operation
	List<ProductSlug> getAllProductSlugs();

	ProductSlug getProductSlugById(String id);

	// Update operation
	ProductSlug updateProductSlug(ProductSlugRequest productSlugRequest);

	// Delete operation
	void deleteProductSlugById(String id);

	List<ProductSlug> getProductSlugByName(String name);

	List<ProductSlug> getProductSlugByStateCategory(ProductSlug productSlug);
}
