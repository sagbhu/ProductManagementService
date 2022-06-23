package com.productmanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.productmanagement.model.ProductLike;

@Repository
public interface ProductLikesRepository extends MongoRepository<ProductLike, String> {

}
