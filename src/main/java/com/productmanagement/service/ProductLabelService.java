package com.productmanagement.service;

import java.util.List;

import com.productmanagement.model.ProductLabel;
import com.productmanagement.request.ProductLabelRequest;

public interface ProductLabelService {

	ProductLabel create(ProductLabel productLabel);

	List<ProductLabel> getAll();

	void delete(String id);

	ProductLabel update(ProductLabelRequest productLabelRequest);
	
	List<ProductLabel> getProductLabelByName(String name);

}
