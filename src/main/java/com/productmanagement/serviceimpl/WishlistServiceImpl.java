package com.productmanagement.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.model.Product;
import com.productmanagement.model.Wishlist;
import com.productmanagement.repository.ProductRepository;
import com.productmanagement.repository.WishlistRepository;
import com.productmanagement.request.WishlistRequest;
import com.productmanagement.service.WishlistService;

@Service
public class WishlistServiceImpl implements WishlistService {

	@Autowired
	WishlistRepository wishlistRepository;

	@Autowired
	ProductRepository productRepository;

	@Override
	public Wishlist addToWishlist(WishlistRequest wishlistRequest) {
		String productId = wishlistRequest.getProductId();
		Wishlist wishlistObj = new Wishlist();
		if (null != productId && !productId.isEmpty()) {
			Optional<Product> DbProduct = productRepository.findById(productId);
			if (null != DbProduct && DbProduct.isPresent()) {
				wishlistObj.setProduct(DbProduct.get());
				wishlistObj.setUserId(wishlistRequest.getUserId());
				wishlistObj.setProductId(wishlistRequest.getProductId());
				return wishlistRepository.save(wishlistObj);
			}
		}
		return wishlistObj;
	}

	@Override
	public List<Wishlist> getWishlistedProducts(String userId) {
		List<Wishlist> WishlistedProducts = wishlistRepository.getWishlistedProductsByUserId(userId);
		List<Wishlist> wishlistedProductsList = new ArrayList<>();
		if (null != WishlistedProducts && !WishlistedProducts.isEmpty()) {
			for (int i = 0; i < WishlistedProducts.size(); i++) {
				String productId = WishlistedProducts.get(i).getProductId();
				String wishlistId = WishlistedProducts.get(i).getId();
				if (null != productId && !productId.isEmpty()) {
					Optional<Product> DbProduct = productRepository.findById(productId);
					Product product = new Product();
					if (DbProduct.isPresent()) {
						product = DbProduct.get();
						Wishlist wishlist = new Wishlist();
						wishlist.setProduct(product);
						wishlist.setProductId(productId);
						wishlist.setUserId(userId);
						wishlist.setId(wishlistId);
						wishlistedProductsList.add(wishlist);
					}
				}
			}
		}
		return wishlistedProductsList;
	}

	@Override
	public String deleteWishlistedProductById(String id) {
		wishlistRepository.deleteById(id);
		return "Deleted Successfully";
	}

}
