package com.productmanagement.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.productmanagement.model.Wishlist;

@Repository
public interface WishlistRepository extends MongoRepository<Wishlist, String> {

	@Query("{'userId': ?0}")
	List<Wishlist> getWishlistedProductsByUserId(String userId);

}
