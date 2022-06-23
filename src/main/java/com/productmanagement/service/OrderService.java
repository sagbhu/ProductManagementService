package com.productmanagement.service;

import java.util.Map;

import com.productmanagement.response.OrderResponse;

public interface OrderService {

	OrderResponse create(Map<String, String> paramMap);

	OrderResponse status(Map<String, String> paramMap);

	OrderResponse orderInvoice(Map<String, String> paramMap);

	OrderResponse orderinvoicepdf(Map<String, String> paramMap);

	OrderResponse orderCancel(Map<String, String> paramMap);

	OrderResponse cancelLineLevel(Map<String, String> paramMap);

	OrderResponse orderPull(Map<String, String> paramMap);

	OrderResponse orderReturn(Map<String, String> paramMap);

	OrderResponse orderReturnStatus(Map<String, String> paramMap);
	
	String trackOrder(String trackingId);

	String formatOrderPullResponse(Map<String, String> paramMap,String uri);

}
