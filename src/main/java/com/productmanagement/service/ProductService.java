package com.productmanagement.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.productmanagement.model.Product;
import com.productmanagement.request.OrderProductsRequest;
import com.productmanagement.request.ProductAvailabilityRequest;
import com.productmanagement.request.ProductRequest;
import com.productmanagement.request.ProductSearchRequest;
import com.productmanagement.request.ProductSyncRequest;
import com.productmanagement.response.ApplicationResponse;
import com.productmanagement.response.ProductApiResponse;
import com.productmanagement.response.ProductAvailabilityResponse;
import com.productmanagement.response.ProductSearchResponse;
import com.productmanagement.response.ProductVinResponse;

public interface ProductService {

	ProductVinResponse syncProductsWithVinculum(ProductSyncRequest productRequest, boolean isFromScheduler);

	ProductSearchResponse getProducts(ProductSearchRequest productSearchRequest);
	
	Page<Product> getProductList(String name,Pageable paging);


	String getLastProductUpdatedDate();

	ApplicationResponse updateProducts(ProductRequest productRequest);

	List<Product> getProductsByCategory(String productCategoryId,String pageNumber);

	List<Product> getProductsBySlug(String slugId, String pageNumber);

	ProductApiResponse getProductByProductId(String productId);
	
	ProductAvailabilityResponse checkAvailability(ProductAvailabilityRequest productAvailabilityRequest);

	List<Product> getOrderProducts(OrderProductsRequest orderProductRequest);
}
