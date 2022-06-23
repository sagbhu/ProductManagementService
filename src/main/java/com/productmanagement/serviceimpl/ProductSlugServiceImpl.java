package com.productmanagement.serviceimpl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.model.ProductSlug;
import com.productmanagement.model.ProductSlugComparator;
import com.productmanagement.repository.ProductSlugRepository;
import com.productmanagement.request.ProductSlugRequest;
import com.productmanagement.service.ProductSlugService;

@Service
public class ProductSlugServiceImpl implements ProductSlugService {

	@Autowired
	ProductSlugRepository productSlugRepository;

	@Override
	public ProductSlug createProductSlug(ProductSlug productSlug) {
		if (productSlug.getSlugName() != null) {
			return productSlugRepository.insert(productSlug);
		}
		return null;
	}

	@Override
	public List<ProductSlug> getAllProductSlugs() {
		return productSlugRepository.findAll();
	}

	@Override
	public ProductSlug getProductSlugById(String id) {
		Optional<ProductSlug> productSlugDB = productSlugRepository.findById(id);
		ProductSlug productSlug = null;
		if (productSlugDB.isPresent()) {
			productSlug = productSlugDB.get();
		}
		return productSlug;
	}

	@Override
	public ProductSlug updateProductSlug(ProductSlugRequest productSlugRequest) {

		Optional<ProductSlug> isProductSlug = productSlugRepository.findById(productSlugRequest.getId());
		ProductSlug productSlug = null;
		if (isProductSlug.isPresent()) {
			productSlug = isProductSlug.get();
			productSlug.setSlugName(productSlugRequest.getSlugName());
			productSlug.setCategory(productSlugRequest.getCategory());
			productSlug.setSequence(productSlugRequest.getSequence());
			productSlug.setDisplayFormat(productSlugRequest.getDisplayFormat());
			productSlug.setState(productSlugRequest.getState());
			productSlug.setDeleted(productSlugRequest.isDeleted());
			productSlugRepository.save(productSlug);
		}
		return productSlug;
	}

	@Override
	public void deleteProductSlugById(String id) {
		productSlugRepository.deleteById(id);
	}

	@Override
	public List<ProductSlug> getProductSlugByName(String name) {
		List<ProductSlug> productSlug = productSlugRepository.getProductSlugByName(name);
		return productSlug;

	}

	@Override
	public List<ProductSlug> getProductSlugByStateCategory(ProductSlug productSlug) {
		List<ProductSlug> productSlugList = productSlugRepository.getProductSlugByState(productSlug.getCategory(),productSlug.getState());
		Collections.sort(productSlugList, new ProductSlugComparator());
		return productSlugList;
	}

}
