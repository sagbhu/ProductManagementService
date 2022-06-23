package com.productmanagement.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.model.ProductLabel;
import com.productmanagement.model.ProductSlug;
import com.productmanagement.repository.ProductLabelRepository;
import com.productmanagement.request.ProductLabelRequest;
import com.productmanagement.request.ProductSlugRequest;
import com.productmanagement.service.ProductLabelService;

@Service
public class ProductLabelServiceImpl implements ProductLabelService {

	@Autowired
	ProductLabelRepository productLabelRepository;

	@Override
	public ProductLabel create(ProductLabel productLabel) {
		return productLabelRepository.insert(productLabel);
	}

	@Override
	public List<ProductLabel> getAll() {
		return productLabelRepository.findAll();
	}

	@Override
	public void delete(String id) {
		productLabelRepository.deleteById(id);
	}

	@Override
	public ProductLabel update(ProductLabelRequest productLabelRequest) {

		Optional<ProductLabel> isProductLabel = productLabelRepository.findById(productLabelRequest.getId());
		ProductLabel productLabels = null;
		if (isProductLabel.isPresent()) {
			productLabels = isProductLabel.get();
			productLabels.setLabelName(productLabelRequest.getLabelName());
			productLabels.setState(productLabelRequest.getState());
			productLabelRepository.save(productLabels);
		}
		return productLabels;
	}

	@Override
	public List<ProductLabel> getProductLabelByName(String name) {
		List<ProductLabel> productLabel = productLabelRepository.getProductLabelByName(name);
		return productLabel;

	}

}
