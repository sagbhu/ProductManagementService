package com.productmanagement.constant;

public interface URLConstants {
	String FETCH_PRODUCT_URL = "https://dhybridcms.vineretail.com/cmsRestWS/api/v1/product/fetchProduct";

	String FETCH_PRODUCT_CATEGORY_URL = "https://dhybrid.vineretail.com/RestWS/api/eretail/v1/common/skuCategoryDetail";

	String PRODUCT_SERVICE_URL = "/productService";

	String ORDER_SERVICE_URL = "/order";

	String ShoppingCart_URL = "/shoppingCart";

	String PRODUCT_LIKES_URL = "/productLikes";

	String HEADER = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.88 Safari/537.36";

	String HOST = "https://dhybrid.vineretail.com";

	String CUSTOM_HOST = "https://dhybridcms.vineretail.com";

	String VINERETAIL_ORDER_CREATE_ENDPOINT = "/RestWS/api/eretail/v1/order/create";

	String VINERETAIL_ORDER_STATUS_ENDPOINT = "/RestWS/api/eretail/v2/order/status";

	String VINERETAIL_ORDER_INVOICE_ENDPOINT = "/RestWS/api/eretail/v2/order/status";

	String VINERETAIL_ORDER_INVOICE_PDF_ENDPOINT = "/RestWS/api/eretail/v1/order/orderinvoicepdf";

	String VINERETAIL_ORDER_CANCEL_ENDPOINT = "/RestWS/api/eretail/v1/order/cancel";

	String VINERETAIL_ORDER_CANCEL_LINE_LEVEL_ENDPOINT = "/RestWS/api/eretail/v1/order/cancelLineLevel";

	String VINERETAIL_ORDER_PULL_ENDPOINT = "/RestWS/api/eretail/v1/order/orderPull";

	String VINERETAIL_ORDER_RETURN_ENDPOINT = "/RestWS/api/eretail/v1/order/return";

	String VINERETAIL_ORDER_RETURN_STATUS_ENDPOINT = "/RestWS/api/eretail/v1/order/orderreturn";

	String PICKER_API_URL = "https://www.pickrr.com/api/check-pincode-service";

	String ORDER_TRACK_API_URL = "https://async.pickrr.com/track/tracking";

	String WISHLIST_URL = "/wishlist";

	String PRODUCT_CUSTOM_FETCH_URL = "/cmsRestWS/api/v1/product/customFetchProduct";

}
