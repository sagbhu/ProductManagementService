package com.productmanagement.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.productmanagement.model.ShoppingCart;
@Repository
public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, String> {
	@Query("{'userId': ?0}")
	List<ShoppingCart> getProductByProductId(String userId);
}
