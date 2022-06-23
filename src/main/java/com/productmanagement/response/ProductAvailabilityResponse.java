package com.productmanagement.response;

public class ProductAvailabilityResponse {
	private String isDeliverable;
	
	private PickerResponse pickerResponse;

	public String getIsDeliverable() {
		return isDeliverable;
	}

	public void setIsDeliverable(String isDeliverable) {
		this.isDeliverable = isDeliverable;
	}

	public PickerResponse getPickerResponse() {
		return pickerResponse;
	}

	public void setPickerResponse(PickerResponse pickerResponse) {
		this.pickerResponse = pickerResponse;
	}	
}
