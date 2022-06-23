package com.productmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.productmanagement.model.ProductLabel;

@Repository
public interface ProductLabelRepository extends MongoRepository<ProductLabel, String>{
	
	
	@Query("{'labelName': {'$regex': /?0/, '$options': 'i'}}")
	List<ProductLabel> getProductLabelByName(String name);

	@Query("{'labelName': {'$regex': /?0/, '$options': 'i'}}")
	Optional<ProductLabel> findProductLabelByName(String name);
	
	
	Optional<ProductLabel> findByLabelName(String name);

}
