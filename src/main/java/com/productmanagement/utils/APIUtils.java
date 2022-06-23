package com.productmanagement.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.productmanagement.constant.URLConstants;
import com.productmanagement.request.ProductAvailabilityRequest;
import com.productmanagement.request.ProductCategorySyncRequest;
import com.productmanagement.request.ProductSyncRequest;
import com.productmanagement.response.PickerResponse;
import com.productmanagement.response.ProductAvailabilityResponse;

public final class APIUtils {
	private static final Logger logger = LoggerFactory.getLogger(APIUtils.class);

	private APIUtils() {
		throw new IllegalStateException("Utility class");
	}

	public static String doPost(ProductSyncRequest productRequest) throws IOException {
		logger.debug("doPost method start in APIUtils class");
		String productsJson = "";
		String productRequestJson = "";
		ObjectMapper mapper = new ObjectMapper();
		try {
			productRequestJson = mapper.writeValueAsString(productRequest.getProductRequestBody());
		} catch (JsonProcessingException e) {
			logger.debug("Error while converting productRequest object to json :" + e.getMessage());
		}
		HttpPost post = new HttpPost();
		List<NameValuePair> urlParameters = new ArrayList<>();
		urlParameters.add(new BasicNameValuePair("ApiOwner", productRequest.getApiOwner()));
		urlParameters.add(new BasicNameValuePair("ApiKey", productRequest.getApiKey()));
		urlParameters.add(new BasicNameValuePair("RequestBody", productRequestJson));
		post.setEntity(new UrlEncodedFormEntity(urlParameters));
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(post)) {
			productsJson = EntityUtils.toString(response.getEntity());
		}
		logger.debug("doPost method end in APIUtils class");
		return productsJson;
	}

	public static String doPost(ProductCategorySyncRequest productCategoryRequest) throws IOException {
		logger.debug("Category doPost method start in APIUtils class");
		String categoriesJson = "";
		String requestBody = "";
		try {
			requestBody = new ObjectMapper().writeValueAsString(productCategoryRequest.getCategoryRequestBody());
		} catch (IOException e) {
			logger.debug("Error when Convert CategoryRequestBody to json string in APIUtils class:" + e.getMessage());
		}
		HttpPost post = new HttpPost(URLConstants.FETCH_PRODUCT_CATEGORY_URL);
		post.addHeader("ApiOwner", productCategoryRequest.getApiOwner());
		post.addHeader("ApiKey", productCategoryRequest.getApiKey());
		post.addHeader("content-type", "application/json");
		post.setEntity(new StringEntity(requestBody));
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(post)) {
			categoriesJson = EntityUtils.toString(response.getEntity());
		}
		logger.debug("Category doPost method end in APIUtils class");
		return categoriesJson;
	}

	public static ProductAvailabilityResponse doGet(ProductAvailabilityRequest productAvailabilityRequest) {
		StringBuilder url = new StringBuilder(URLConstants.PICKER_API_URL);
		url.append("/?from_pincode=" + productAvailabilityRequest.getFrom_pincode());
		url.append("&to_pincode=" + productAvailabilityRequest.getTo_pincode());
		url.append("&auth_token=" + "2e2266cef2682b34a73128c9cbeda90d779485");

		HttpGet request = new HttpGet(url.toString());

		ProductAvailabilityResponse productAvailabilityResponse = new ProductAvailabilityResponse();
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(request)) {

			HttpEntity entity = response.getEntity();
			if (entity != null) {
				String result;
				try {
					result = EntityUtils.toString(entity);
					JSONObject json = new JSONObject(result);
					if (!json.has("status_code")) {
						PickerResponse pickerResponse = new ObjectMapper().readValue(result, PickerResponse.class);
						productAvailabilityResponse.setIsDeliverable("true");
						productAvailabilityResponse.setPickerResponse(pickerResponse);
					} else {
						productAvailabilityResponse.setIsDeliverable("false");
					}

					logger.debug(result);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return productAvailabilityResponse;
	}
	
	public static String doPost(String requestBody) {
		logger.debug("doPost method start in APIUtils class");
		String responseJson = "";

		try {
			HttpPost post = new HttpPost(URLConstants.HOST + URLConstants.VINERETAIL_ORDER_STATUS_ENDPOINT);
			post.addHeader("ApiOwner", "sa");
			post.addHeader("ApiKey", "be5f07cf82ae4b6d9817708a19b3c7cf0de1065774c54b52aa4dbf9");
			post.addHeader("RequestBody",requestBody);
			post.addHeader("content-type", MediaType.APPLICATION_FORM_URLENCODED_VALUE);
			//post.setEntity(new StringEntity(requestBody));
			try (CloseableHttpClient httpClient = HttpClients.createDefault();
					CloseableHttpResponse response = httpClient.execute(post)) {
				responseJson = EntityUtils.toString(response.getEntity());
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		logger.debug("doPost method end in APIUtils class");
		return responseJson;
	}
	
	public static String doGet(String trackingId) {
		StringBuilder url = new StringBuilder(URLConstants.ORDER_TRACK_API_URL);
		url.append("/?tracking_id=" + trackingId);
		url.append("&auth_token=" + "2e2266cef2682b34a73128c9cbeda90d779485");

		HttpGet request = new HttpGet(url.toString());

		String orderTrackResponse = "";
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
				CloseableHttpResponse response = httpClient.execute(request)) {

			HttpEntity entity = response.getEntity();
			if (entity != null) {
				try {
					orderTrackResponse = EntityUtils.toString(entity);

					logger.debug(orderTrackResponse);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return orderTrackResponse;
	}
}
