package com.productmanagement.serviceimpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.productmanagement.constant.URLConstants;
import com.productmanagement.model.Order;
import com.productmanagement.response.OrderResponse;
import com.productmanagement.response.RequestStatus;
import com.productmanagement.service.OrderService;
import com.productmanagement.utils.APIUtils;
import com.productmanagement.utils.HttpPostForm;

@Service
public class OrderServiceImpl implements OrderService {

	@Override
	public OrderResponse create(Map<String, String> paramMap) {
		return formatResponse(generateRequest(paramMap, URLConstants.VINERETAIL_ORDER_CREATE_ENDPOINT));
	}

	@Override
	public OrderResponse status(Map<String, String> paramMap) {
		return formatResponse(generateRequest(paramMap, URLConstants.VINERETAIL_ORDER_STATUS_ENDPOINT));
	}

	@Override
	public OrderResponse orderInvoice(Map<String, String> paramMap) {
		return formatResponse(generateRequest(paramMap, URLConstants.VINERETAIL_ORDER_INVOICE_ENDPOINT));
	}

	@Override
	public OrderResponse orderinvoicepdf(Map<String, String> paramMap) {
		return formatResponse(generateRequest(paramMap, URLConstants.VINERETAIL_ORDER_INVOICE_PDF_ENDPOINT));
	}

	@Override
	public OrderResponse orderCancel(Map<String, String> paramMap) {
		return formatResponse(generateRequest(paramMap, URLConstants.VINERETAIL_ORDER_CANCEL_ENDPOINT));
	}

	@Override
	public OrderResponse cancelLineLevel(Map<String, String> paramMap) {
		return formatResponse(generateRequest(paramMap, URLConstants.VINERETAIL_ORDER_CANCEL_LINE_LEVEL_ENDPOINT));
	}

	@Override
	public OrderResponse orderPull(Map<String, String> paramMap) {
		return formatResponse(generateRequest(paramMap, URLConstants.VINERETAIL_ORDER_PULL_ENDPOINT));
	}

	@Override
	public OrderResponse orderReturn(Map<String, String> paramMap) {
		return formatResponse(generateRequest(paramMap, URLConstants.VINERETAIL_ORDER_RETURN_ENDPOINT));
	}

	@Override
	public OrderResponse orderReturnStatus(Map<String, String> paramMap) {
		return formatResponse(generateRequest(paramMap, URLConstants.VINERETAIL_ORDER_RETURN_STATUS_ENDPOINT));
	}

	public String generateRequest(Map<String, String> paramMap, String endPoint) {
		try {
			String hostValue = "";
			if(endPoint.equals(URLConstants.PRODUCT_CUSTOM_FETCH_URL)) {
				hostValue = URLConstants.CUSTOM_HOST;
			}else {
				hostValue = URLConstants.HOST;
			}
			Map<String, String> headers = new HashMap<>();
			headers.put("User-Agent", URLConstants.HEADER);
			HttpPostForm httpPostForm;
			httpPostForm = new HttpPostForm(hostValue + endPoint, "utf-8", headers);
			httpPostForm.addFormField("ApiOwner", paramMap.get("ApiOwner"));
			httpPostForm.addFormField("ApiKey", paramMap.get("ApiKey"));
			httpPostForm.addFormField("RequestBody", paramMap.get("RequestBody"));
			return httpPostForm.finish();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private OrderResponse formatResponse(String response) {
		OrderResponse orderResponse = null;
		if (response != null) {
			orderResponse = new OrderResponse();
			JSONObject jsonObject = new JSONObject(response);
			if (jsonObject.has("responseMessage")) {
				orderResponse.setResponseMessage(jsonObject.getString("responseMessage").toString());
			}
			if (jsonObject.has("responseCode")) {
				orderResponse.setResponseCode(Integer.parseInt(jsonObject.get("responseCode").toString()));
			}
			if (jsonObject.has("requestStatus")) {
				JSONObject jsonResponseStatus = jsonObject.getJSONObject("requestStatus");
				RequestStatus requestStatus = new RequestStatus();
				requestStatus.setRequestKey(jsonResponseStatus.get("requestKey").toString());
				requestStatus.setUniqueKey(jsonResponseStatus.get("uniqueKey").toString());
				requestStatus.setOutputKey(jsonResponseStatus.get("outputKey").toString());
				requestStatus.setStatus(jsonResponseStatus.get("status").toString());
				requestStatus.setErrorDesc(jsonResponseStatus.get("errorDesc").toString());
				orderResponse.setRequestStatus(requestStatus);
			}
			if (jsonObject.has("totalOrders")) {
				String totalOrders = jsonObject.get("totalOrders").toString();
				totalOrders = totalOrders == null || totalOrders.isEmpty() || totalOrders.equals("null") ? "0"
						: totalOrders;
				orderResponse.setTotalOrders(Integer.parseInt(totalOrders));
			}
			if (jsonObject.has("totalPages")) {
				String totalPages = jsonObject.get("totalPages").toString();
				totalPages = totalPages == null || totalPages.isEmpty() || totalPages.equals("null") ? "0" : totalPages;

				orderResponse.setResponseCode(Integer.parseInt(totalPages == null ? "0" : totalPages));
			}
			if (jsonObject.has("currentPage")) {
				String currentPage = jsonObject.get("currentPage").toString();
				currentPage = currentPage == null || currentPage.isEmpty() || currentPage.equals("null") ? "0"
						: currentPage;
				orderResponse.setResponseCode(Integer.parseInt(currentPage == null ? "0" : currentPage));
			}
			if (jsonObject.has("order")) {
				String orderJsonString = jsonObject.get("order").toString().trim();
				if ( !orderJsonString.equals("null")) {

					List<Order> order = null;
					try {
						order = (List<Order>) new ObjectMapper().readValue(jsonObject.get("currentPage").toString(),
								Order.class);
					} catch (JsonProcessingException | JSONException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					orderResponse.setOrder(order);
				}
			}
		}
		return orderResponse;
	}
	
	@Override
	public String trackOrder(String trackingId) {
		return APIUtils.doGet(trackingId);
	}
	
	@Override
	public String formatOrderPullResponse(Map<String, String> paramMap,String uri) {
		return generateRequest(paramMap, uri);	
	}
}
