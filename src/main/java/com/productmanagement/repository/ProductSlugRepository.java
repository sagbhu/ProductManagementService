package com.productmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.productmanagement.model.ProductSlug;

@Repository
public interface ProductSlugRepository extends MongoRepository<ProductSlug, String> {

	@Query("{'slugName': {'$regex': /?0/, '$options': 'i'}}")
	List<ProductSlug> getProductSlugByName(String name);

	//@Query("{'state': ?0} , 'category' : ?1}\"")
	//@Query("{'category': ?0}")
	@Query("{'$and':[ {'category': ?0}, {'state': ?1} ] }")
	List<ProductSlug> getProductSlugByState(String category, String state);
	
	@Query("{'slugName': {'$regex': /?0/, '$options': 'i'}}")
	Optional<ProductSlug> findProductSlugByName(String name);
	
	Optional<ProductSlug> findBySlugName(String slugName); 

}
