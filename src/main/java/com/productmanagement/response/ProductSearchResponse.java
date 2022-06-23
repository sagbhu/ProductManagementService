package com.productmanagement.response;

import java.util.List;

public class ProductSearchResponse {

	private long count;

	private List<ProductApiResponse> productApiResponseList;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<ProductApiResponse> getProductApiResponseList() {
		return productApiResponseList;
	}

	public void setProductApiResponseList(List<ProductApiResponse> productApiResponseList) {
		this.productApiResponseList = productApiResponseList;
	}

}
