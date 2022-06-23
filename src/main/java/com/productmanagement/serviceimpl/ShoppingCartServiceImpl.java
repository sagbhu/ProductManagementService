package com.productmanagement.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productmanagement.model.Product;
import com.productmanagement.model.ShoppingCart;
import com.productmanagement.repository.ProductRepository;
import com.productmanagement.repository.ShoppingCartRepository;
import com.productmanagement.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
	@Autowired
	ShoppingCartRepository shoppingCartRepository;

	@Autowired
	ProductRepository productRepository;

	public ShoppingCart addToCart(ShoppingCart shoppingCart) {
		return shoppingCartRepository.save(shoppingCart);
	}

	public List<ShoppingCart> getCartProducts() {
		return shoppingCartRepository.findAll();
	}

	@Override
	public void deleteCartProductById(String id) {
		shoppingCartRepository.deleteById(id);
	}

	@Override
	public ShoppingCart updateCartProduct(ShoppingCart shoppingCart) {
		Optional<ShoppingCart> isShoppingCart = shoppingCartRepository.findById(shoppingCart.getId());
		ShoppingCart newShoppingCart = null;
		while (isShoppingCart.isPresent()) {
			newShoppingCart = isShoppingCart.get();
			newShoppingCart.setCreatedDate(shoppingCart.getCreatedDate());
			newShoppingCart.setCreatedUserId(shoppingCart.getCreatedUserId());
			newShoppingCart.setDiscount(shoppingCart.getDiscount());
			newShoppingCart.setPrice(shoppingCart.getPrice());
			newShoppingCart.setProductCategory(shoppingCart.getProductCategory());
			newShoppingCart.setProductId(shoppingCart.getProductId());
			newShoppingCart.setProductName(shoppingCart.getProductName());
			newShoppingCart.setQuantity(shoppingCart.getQuantity());
			newShoppingCart.setStatus(shoppingCart.getStatus());
			newShoppingCart.setTransactionId(shoppingCart.getTransactionId());
			newShoppingCart.setUpdateDate(shoppingCart.getUpdateDate());
			newShoppingCart.setUpdatedUserId(shoppingCart.getUpdatedUserId());
			newShoppingCart.setUserId(shoppingCart.getUserId());
			newShoppingCart.setColor(shoppingCart.getColor());
			newShoppingCart.setSize(shoppingCart.getSize());
			newShoppingCart.setBasePrice(shoppingCart.getBasePrice());
			ShoppingCart newShoppingCart1 = shoppingCartRepository.save(newShoppingCart);
			return newShoppingCart1;
		}
		return null;
	}

	@Override
	public List<ShoppingCart> getUseCartProducts(String userId) {
		List<ShoppingCart> shppoingCarts = shoppingCartRepository.getProductByProductId(userId);
		for (int i = 0; i < shppoingCarts.size(); i++) {
			ShoppingCart shoppingCart = new ShoppingCart();
			shoppingCart = shppoingCarts.get(i);
			String productId = shoppingCart.getProductId();
			if (null != productId) {
				Optional<Product> productDb = productRepository.findById(productId);
				Product product = null;
				if (productDb.isPresent()) {
					product = productDb.get();
				}
				shoppingCart.setProduct(product);
			}
		}
		return shppoingCarts;
	}
}
