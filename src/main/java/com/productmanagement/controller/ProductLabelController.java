package com.productmanagement.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.productmanagement.model.ProductLabel;
import com.productmanagement.request.ProductLabelRequest;
import com.productmanagement.service.ProductLabelService;

@RestController
@RequestMapping(URLConstants.PRODUCT_SERVICE_URL)
public class ProductLabelController {

	private static final Logger logger = LoggerFactory.getLogger(ProductLabelController.class);

	@Autowired
	private ProductLabelService productLabelService;

	@PostMapping("/product/label/create")
	public ResponseEntity<ProductLabel> create(@RequestBody ProductLabel productLabel) {
		logger.debug("createProductLabel method start in ProductLabelController");
		ProductLabel newProductLabel = productLabelService.create(productLabel);
		logger.debug("createProductLabel method start in ProductLabelController");
		return new ResponseEntity<>(newProductLabel, HttpStatus.CREATED);
	}

	@GetMapping("/product/label/list")
	public ResponseEntity<List<ProductLabel>> getAll() {
		logger.debug("getAllProductLabels method start in ProductLabelController");
		List<ProductLabel> productLabelList = productLabelService.getAll();
		logger.debug("getting AllProductLabels method end  in ProductLabelController");
		return new ResponseEntity<>(productLabelList, HttpStatus.OK);
	}

	@PutMapping("/product/label/update")
	public ResponseEntity<ProductLabel> update(@RequestBody ProductLabelRequest productLabelRequest) {
		logger.debug("updateProductLabel method start in ProductLabelController");
		ProductLabel updatedProductLabel = productLabelService.update(productLabelRequest);
		logger.debug("updateProductLabel method end in ProductLabelController");
		return new ResponseEntity<>(updatedProductLabel, HttpStatus.OK);
	}

	@DeleteMapping("/product/label/delete/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable("id") String id) {
		logger.debug("deleteProductLabel method start in ProductLabelController");
		productLabelService.delete(id);
		logger.debug("deleteProductLabel method end in ProductLabelController");
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/product/label/search/{name}")
	public ResponseEntity<List<ProductLabel>> getProductLabelByName(@PathVariable("name") String name) {
		logger.debug("getProductSlugById method start in ProductSlugController");
		List<ProductLabel> productSlug = productLabelService.getProductLabelByName(name);
		logger.debug("getProductSlugById method end in ProductSlugController");
		return new ResponseEntity<>(productSlug, HttpStatus.OK);
	}

}
