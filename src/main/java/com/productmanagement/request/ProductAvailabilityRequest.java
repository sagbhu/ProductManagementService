package com.productmanagement.request;

public class ProductAvailabilityRequest {
	private String from_pincode;

	private String to_pincode;

	public String getFrom_pincode() {
		return from_pincode;
	}

	public void setFrom_pincode(String from_pincode) {
		this.from_pincode = from_pincode;
	}

	public String getTo_pincode() {
		return to_pincode;
	}

	public void setTo_pincode(String to_pincode) {
		this.to_pincode = to_pincode;
	}
}
