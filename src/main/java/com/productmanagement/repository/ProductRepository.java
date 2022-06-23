package com.productmanagement.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.productmanagement.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

	@Query("{'$or':[ {'skuName': {'$regex': /?0/, '$options': 'i'}}, {'description': {'$regex': '/?0/', '$options': 'i'}} ] }")
	Page<Product> getProductListBySearchParam(String searchParam, Pageable page);

	@Query("{'brand': {'$regex': /?0/, '$options': 'i'}}")
	Page<Product> getProductListByBrandName(String brand, Pageable page);

	@Query("{'color': {'$regex': /?0/, '$options': 'i'}}")
	Page<Product> getProductListByColor(String color, Pageable page);

	@Query("{'productStatus': {'$regex': /?0/, '$options': 'i'}}")
	Page<Product> getProductListByAvailability(String availability, Pageable page);

	@Query("{'mRP' : {$gt : ?0, $lt : ?1}}")
	Page<Product> getProductListByPriceRange(double priceStart, double priceEnd, Pageable page);

	@Query("{'slug.$id': ObjectId('?0')}")
	Page<Product> getProductListBySlug(String slugId, Pageable page);

	@Query("{}")
	List<Product> getLastProductUpdatedDate(Pageable page);

	@Query("{'categoryId': ?0}")
	List<Product> getProductsByCategory(String categoryId, Pageable page);

	@Query("{'slug.$id': ObjectId('?0')}")
	List<Product> getProductsBySlug(String slugId, Pageable page);

	@Query("{'skuCode': ?0}")
	Product getProductByProductId(String skuCode);

	@Query("{'skuCode' : { $in : ?0}}")
	List<Product> findBy(String[] skuCodes);

	@Query("{'skuCode': ?0}")
	Page<Product> getProductListByProductId(String productId, Pageable paging);
}
