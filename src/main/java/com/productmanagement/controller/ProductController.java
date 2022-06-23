package com.productmanagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.constant.URLConstants;
import com.productmanagement.model.Product;
import com.productmanagement.model.ProductCategory;
import com.productmanagement.request.OrderProductsRequest;
import com.productmanagement.request.ProductAvailabilityRequest;
import com.productmanagement.request.ProductCategorySyncRequest;
import com.productmanagement.request.ProductRequest;
import com.productmanagement.request.ProductSearchRequest;
import com.productmanagement.request.ProductSyncRequest;
import com.productmanagement.response.ApplicationResponse;
import com.productmanagement.response.OrderProductResponse;
import com.productmanagement.response.ProductApiResponse;
import com.productmanagement.response.ProductAvailabilityResponse;
import com.productmanagement.response.ProductCategoryResponse;
import com.productmanagement.response.ProductSearchResponse;
import com.productmanagement.response.ProductVinResponse;
import com.productmanagement.service.ProductCategoryService;
import com.productmanagement.service.ProductService;

@RestController
@RequestMapping(URLConstants.PRODUCT_SERVICE_URL)
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	ProductService productService;

	@Autowired
	ProductCategoryService productCategoryService;

	@PostMapping("/syncProductsWithVinculum")
	public ResponseEntity<ProductVinResponse> syncProductsWithVinculum(@RequestBody ProductSyncRequest productRequest,
			boolean isFromScheduler) {
		logger.debug("syncProductsWithVinculum method start in ProductController");
		ProductVinResponse productResponse = productService.syncProductsWithVinculum(productRequest, false);
		logger.debug("syncProductsWithVinculum method end in ProductController");
		return new ResponseEntity<>(productResponse, HttpStatus.OK);
	}

	@PostMapping("/syncProductCategoriesWithVinculum")
	public ResponseEntity<ProductCategoryResponse> syncProductCategoriesWithVinculum(
			@RequestBody ProductCategorySyncRequest productCategoryRequest) {
		logger.debug("syncProductCategoriesWithVinculum method start in ProductController");
		ProductCategoryResponse productCategoryResponse = productCategoryService
				.syncProductsCategoriesWithVinculum(productCategoryRequest, false);
		logger.debug("syncProductCategoriesWithVinculum method end in ProductController");
		return new ResponseEntity<>(productCategoryResponse, HttpStatus.OK);
	}

	@GetMapping("/getProductCategories")
	public ResponseEntity<List<ProductCategory>> getProductCategories() {
		logger.debug("getProductCategories method start in ProductController");
		List<ProductCategory> productCategory = productCategoryService.getProductCategories();
		logger.debug("getProductCategories method end in ProductController");
		return new ResponseEntity<>(productCategory, HttpStatus.OK);
	}

	@PostMapping("/getProducts")
	public ResponseEntity<ProductSearchResponse> getProducts(@RequestBody ProductSearchRequest productSearchRequest) {
		logger.debug("getProducts method start in ProductController");
		ProductSearchResponse products = productService.getProducts(productSearchRequest);
		logger.debug("getProducts method end in ProductController");
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/products")
	public Map<String, Object> getProductList(@RequestParam(required = false) String name,
			@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "3") int size) {
		Pageable paging = PageRequest.of(page, size);

		logger.debug("getProducts method start in ProductController");
		Page<Product> products = productService.getProductList(name, paging);

		Map<String, Object> response = new HashMap<>();
		response.put("products", products.getContent());
		response.put("currentPage", products.getNumber());
		response.put("totalItems", products.getTotalElements());
		response.put("totalPages", products.getTotalPages());
		response.put("status", true);
		response.put("code", org.apache.http.HttpStatus.SC_OK);
		response.put("message", "ProductList get successfully");

		logger.debug("getProducts method end in ProductController");
		return response;
	}

	@PutMapping("/updateProducts")
	public ApplicationResponse updateProduct(@Validated @RequestBody ProductRequest productRequest) {
		logger.debug("getProducts method start in ProductController");
		ApplicationResponse applicationResponse = productService.updateProducts(productRequest);
		logger.debug("getProducts method end in ProductController");
		return applicationResponse;
	}

	@GetMapping("/getProductsByCategory/{productCategoryId}/{pageNumber}")
	public ResponseEntity<List<Product>> getProductsByCategory(
			@PathVariable("productCategoryId") String productCategoryId,
			@PathVariable("pageNumber") String pageNumber) {
		logger.debug("getProductsByCategory method start in ProductController");
		List<Product> products = productService.getProductsByCategory(productCategoryId, pageNumber);
		logger.debug("getProductsByCategory method end in ProductController");
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/getProductsBySlug/{slugId}/{pageNumber}")
	public ResponseEntity<List<Product>> getProductsBySlug(@PathVariable("slugId") String slugId,
			@PathVariable("pageNumber") String pageNumber) {
		logger.debug("getProductsBySlug method start in ProductController");
		List<Product> products = productService.getProductsBySlug(slugId, pageNumber);
		logger.debug("getProductsBySlug method end in ProductController");
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/getProducts/{productId}")
	public ResponseEntity<ProductApiResponse> getProductByProductId(@PathVariable("productId") String productId) {
		logger.debug("getProductByProductId method start in ProductController");
		ProductApiResponse productApiResponse = productService.getProductByProductId(productId);
		logger.debug("getProductByProductId method end in ProductController");
		return new ResponseEntity<>(productApiResponse, HttpStatus.OK);
	}

	@PostMapping("/checkAvailability")
	public ResponseEntity<ProductAvailabilityResponse> checkAvailability(
			@RequestBody ProductAvailabilityRequest productAvailabilityRequest) {
		logger.debug("checkAvailability method start in ProductController");
		ProductAvailabilityResponse productAvailabilityResponse = productService
				.checkAvailability(productAvailabilityRequest);
		logger.debug("checkAvailability method end in ProductController");
		return new ResponseEntity<>(productAvailabilityResponse, HttpStatus.OK);
	}

	@PostMapping("/getOrderProducts")
	public ResponseEntity<List<Product>> getOrderProducts(@RequestBody OrderProductsRequest orderProductRequest) {
		List<Product> productList = productService.getOrderProducts(orderProductRequest);
		return new ResponseEntity<>(productList, HttpStatus.OK);
	}

	@PostMapping("/getOrderProductsDetail")
	public ResponseEntity<OrderProductResponse> getOrderProductsDetail(
			@RequestBody OrderProductsRequest orderProductRequest) {
		List<Product> productList = productService.getOrderProducts(orderProductRequest);
		OrderProductResponse orderProductResponse = new OrderProductResponse();
		orderProductResponse.setProducts(productList);
		return new ResponseEntity<>(orderProductResponse, HttpStatus.OK);
	}

}
