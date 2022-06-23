package com.productmanagement.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.constant.ProductServiceConstants;
import com.productmanagement.constant.URLConstants;
import com.productmanagement.response.OrderResponse;
import com.productmanagement.service.OrderService;

@RestController
@RequestMapping(URLConstants.ORDER_SERVICE_URL)
public class OrderController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Autowired
	OrderService orderService;

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody OrderResponse create(@RequestParam Map<String, String> paramMap) {
		logger.debug("create method start in OrderController");
		setVinCredentials(paramMap);
		OrderResponse orderResponse = new OrderResponse();
		if (paramMap.get("ApiOwner").isEmpty() || paramMap.get("ApiKey").isEmpty()
				|| paramMap.get("RequestBody").isEmpty()) {
			orderResponse.setResponseMessage("Fail");
			return orderResponse;
		}
		orderResponse = orderService.create(paramMap);
		logger.debug("create method end in OrderController");
		return orderResponse;
	}

	@RequestMapping(value = "/status", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody String status(@RequestParam Map<String, String> paramMap) {
		logger.debug("status method start in OrderController");
		setVinCredentials(paramMap);
		if (paramMap.get("ApiOwner").isEmpty() || paramMap.get("ApiKey").isEmpty()
				|| paramMap.get("RequestBody").isEmpty()) {
			return "Fail";
		}
		String orderResponse = orderService.formatOrderPullResponse(paramMap,
				URLConstants.VINERETAIL_ORDER_STATUS_ENDPOINT);
		logger.debug("status method end in OrderController");
		return orderResponse;
	}

	@RequestMapping(value = "/orderInvoice", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody OrderResponse orderInvoice(@RequestParam Map<String, String> paramMap) {
		logger.debug("orderInvoice method start in OrderController");
		setVinCredentials(paramMap);
		OrderResponse orderResponse = new OrderResponse();
		if (paramMap.get("ApiOwner").isEmpty() || paramMap.get("ApiKey").isEmpty()
				|| paramMap.get("RequestBody").isEmpty()) {
			orderResponse.setResponseMessage("Fail");
			return orderResponse;
		}
		orderResponse = orderService.orderInvoice(paramMap);
		logger.debug("orderInvoice method end in OrderController");
		return orderResponse;
	}

	@RequestMapping(value = "/orderInvoicePdf", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody OrderResponse orderinvoicepdf(@RequestParam Map<String, String> paramMap) {
		logger.debug("orderInvoice method start in OrderController");
		setVinCredentials(paramMap);
		OrderResponse orderResponse = new OrderResponse();
		if (paramMap.get("ApiOwner").isEmpty() || paramMap.get("ApiKey").isEmpty()
				|| paramMap.get("RequestBody").isEmpty()) {
			orderResponse.setResponseMessage("Fail");
			return orderResponse;
		}
		orderResponse = orderService.orderinvoicepdf(paramMap);
		logger.debug("orderInvoice method end in OrderController");
		return orderResponse;
	}

	@RequestMapping(value = "/cancel", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody OrderResponse orderCancel(@RequestParam Map<String, String> paramMap) {
		logger.debug("orderInvoice method start in OrderController");
		setVinCredentials(paramMap);
		OrderResponse orderResponse = new OrderResponse();
		if (paramMap.get("ApiOwner").isEmpty() || paramMap.get("ApiKey").isEmpty()
				|| paramMap.get("RequestBody").isEmpty()) {
			orderResponse.setResponseMessage("Fail");
			return orderResponse;
		}
		orderResponse = orderService.orderCancel(paramMap);
		logger.debug("orderInvoice method end in OrderController");
		return orderResponse;
	}

	@RequestMapping(value = "/cancelLineLevel", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody OrderResponse cancelLineLevel(@RequestParam Map<String, String> paramMap) {
		logger.debug("orderInvoice method start in OrderController");
		setVinCredentials(paramMap);
		OrderResponse orderResponse = new OrderResponse();
		if (paramMap.get("ApiOwner").isEmpty() || paramMap.get("ApiKey").isEmpty()
				|| paramMap.get("RequestBody").isEmpty()) {
			orderResponse.setResponseMessage("Fail");
			return orderResponse;
		}
		orderResponse = orderService.cancelLineLevel(paramMap);
		logger.debug("orderInvoice method end in OrderController");
		return orderResponse;
	}

	@RequestMapping(value = "/orderPull", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody String orderPull(@RequestParam Map<String, String> paramMap) {
		logger.debug("orderPull method start in OrderController");
		setVinCredentials(paramMap);

		if (paramMap.get("ApiOwner").isEmpty() || paramMap.get("ApiKey").isEmpty()
				|| paramMap.get("RequestBody").isEmpty()) {
			return "Fail";
		}
		String orderResponse = orderService.formatOrderPullResponse(paramMap,
				URLConstants.VINERETAIL_ORDER_PULL_ENDPOINT);
		logger.debug("orderPull method end in OrderController");
		return orderResponse;
	}

	@RequestMapping(value = "/return", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody OrderResponse orderReturn(@RequestParam Map<String, String> paramMap) {
		logger.debug("orderInvoice method start in OrderController");
		setVinCredentials(paramMap);
		OrderResponse orderResponse = new OrderResponse();
		if (paramMap.get("ApiOwner").isEmpty() || paramMap.get("ApiKey").isEmpty()
				|| paramMap.get("RequestBody").isEmpty()) {
			orderResponse.setResponseMessage("Fail");
			return orderResponse;
		}
		orderResponse = orderService.orderReturn(paramMap);
		logger.debug("orderInvoice method end in OrderController");
		return orderResponse;
	}

	@RequestMapping(value = "/orderReturn", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody OrderResponse orderReturnStatus(@RequestParam Map<String, String> paramMap) {
		logger.debug("orderInvoice method start in OrderController");
		setVinCredentials(paramMap);
		OrderResponse orderResponse = new OrderResponse();
		if (paramMap.get("ApiOwner").isEmpty() || paramMap.get("ApiKey").isEmpty()
				|| paramMap.get("RequestBody").isEmpty()) {
			orderResponse.setResponseMessage("Fail");
			return orderResponse;
		}
		orderResponse = orderService.orderReturnStatus(paramMap);
		logger.debug("orderInvoice method end in OrderController");
		return orderResponse;
	}

	private void setVinCredentials(Map<String, String> paramMap) {
		paramMap.put("ApiOwner", ProductServiceConstants.ORDER_API_OWNER);
		paramMap.put("ApiKey", ProductServiceConstants.ORDER_API_KEY);
	}

	@PostMapping("/trackOrder/{trackingId}")
	public ResponseEntity<String> trackOrder(@PathVariable("trackingId") String trackingId) {
		logger.debug("checkAvailability method start in ProductController");
		String status = orderService.trackOrder(trackingId);
		logger.debug("checkAvailability method end in ProductController");
		return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
