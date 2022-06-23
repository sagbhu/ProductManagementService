package com.productmanagement.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.model.ProductLike;
import com.productmanagement.repository.ProductLikesRepository;
import com.productmanagement.service.ProductLikesService;

@Service
public class ProductLikesServiceImpl implements ProductLikesService {
	@Autowired
	ProductLikesRepository productLikeRepository;

	public ProductLike saveProductLike(ProductLike productLike) {
		return productLikeRepository.insert(productLike);
	}

}
