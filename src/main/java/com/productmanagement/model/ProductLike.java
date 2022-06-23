package com.productmanagement.model;

public class ProductLike {
	private String id;
	private String productId;
	private String ratingValue;
	private String userId;
	private String createdDate;
	private String updatedDate;

	public ProductLike(String id, String productId, String ratingValue, String userId, String createdDate,
			String updatedDate) {
		super();
		this.id = id;
		this.productId = productId;
		this.ratingValue = ratingValue;
		this.userId = userId;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public ProductLike() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getRatingValue() {
		return ratingValue;
	}

	public void setRatingValue(String ratingValue) {
		this.ratingValue = ratingValue;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}

}
