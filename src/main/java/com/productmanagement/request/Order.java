package com.productmanagement.request;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String order_location;
	private String uniqueKey;
	private String order_no;
	private String order_type;
	private String payment_type;
	private String awbNo;
	private String status;
	private String hold_status;
	private String address_verified;
	private String payment_verified;
	private String address_type;
	private String order_amount;
	private String order_date;
	private String shipby_date;
	private String order_currency;
	private String conversion_rate;
	private String is_replacement;
	private String original_orderno;
	private String customer_code;
	private String extCustomerCode;
	private String customer_name;
	private String ship_address1;
	private String ship_address2;
	private String ship_address3;
	private String ship_address4;
	private String ship_city;
	private String ship_state;
	private String ship_country;
	private String ship_pincode;
	private String ship_phone1;
	private String ship_phone2;
	private String ship_email1;
	private String ship_email2;
	private String bill_name;
	private String bill_address1;
	private String bill_address2;
	private String bill_address3;
	private String bill_address4;
	private String bill_city;
	private String bill_state;
	private String landmark;
	private String latitude;
	private String longitude;
	private String url;
	private String bill_country;
	private String bill_pincode;
	private String bill_phone1;
	private String bill_phone2;
	private String bill_email1;
	private String bill_email2;
	private String order_remarks;
	private String shipping_charges;
	private String other_charge1;
	private String other_charge2;
	private String store_credit;
	private String other_discount;
	private String cancel_remark;
	private String udf1;
	private String udf2;
	private String udf3;
	private String udf4;
	private String udf5;
	private String udf6;
	private String udf7;
	private String udf8;
	private String udf9;
	private String udf10;
	private String custTinNo;
	private String pickAfterDate;
	private Object giftwrapCharge;
	private Object gvAmount;
	private Integer rewardPointsAmount;
	private String cust_type;
	private String req_type;
	private String pickupLocation;
	private List<Item> items = new ArrayList<Item>();
	private List<PaymentItem> paymentItems = new ArrayList<PaymentItem>();

	public String getOrder_location() {
		return order_location;
	}

	public void setOrder_location(String order_location) {
		this.order_location = order_location;
	}

	public String getUniqueKey() {
		return uniqueKey;
	}

	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

	public String getOrder_no() {
		return order_no;
	}

	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHold_status() {
		return hold_status;
	}

	public void setHold_status(String hold_status) {
		this.hold_status = hold_status;
	}

	public String getAddress_verified() {
		return address_verified;
	}

	public void setAddress_verified(String address_verified) {
		this.address_verified = address_verified;
	}

	public String getPayment_verified() {
		return payment_verified;
	}

	public void setPayment_verified(String payment_verified) {
		this.payment_verified = payment_verified;
	}

	public String getAddress_type() {
		return address_type;
	}

	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}

	public String getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(String order_amount) {
		this.order_amount = order_amount;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getShipby_date() {
		return shipby_date;
	}

	public void setShipby_date(String shipby_date) {
		this.shipby_date = shipby_date;
	}

	public String getOrder_currency() {
		return order_currency;
	}

	public void setOrder_currency(String order_currency) {
		this.order_currency = order_currency;
	}

	public String getConversion_rate() {
		return conversion_rate;
	}

	public void setConversion_rate(String conversion_rate) {
		this.conversion_rate = conversion_rate;
	}

	public String getIs_replacement() {
		return is_replacement;
	}

	public void setIs_replacement(String is_replacement) {
		this.is_replacement = is_replacement;
	}

	public String getOriginal_orderno() {
		return original_orderno;
	}

	public void setOriginal_orderno(String original_orderno) {
		this.original_orderno = original_orderno;
	}

	public String getCustomer_code() {
		return customer_code;
	}

	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}

	public String getExtCustomerCode() {
		return extCustomerCode;
	}

	public void setExtCustomerCode(String extCustomerCode) {
		this.extCustomerCode = extCustomerCode;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getShip_address1() {
		return ship_address1;
	}

	public void setShip_address1(String ship_address1) {
		this.ship_address1 = ship_address1;
	}

	public String getShip_address2() {
		return ship_address2;
	}

	public void setShip_address2(String ship_address2) {
		this.ship_address2 = ship_address2;
	}

	public String getShip_address3() {
		return ship_address3;
	}

	public void setShip_address3(String ship_address3) {
		this.ship_address3 = ship_address3;
	}

	public String getShip_address4() {
		return ship_address4;
	}

	public void setShip_address4(String ship_address4) {
		this.ship_address4 = ship_address4;
	}

	public String getShip_city() {
		return ship_city;
	}

	public void setShip_city(String ship_city) {
		this.ship_city = ship_city;
	}

	public String getShip_state() {
		return ship_state;
	}

	public void setShip_state(String ship_state) {
		this.ship_state = ship_state;
	}

	public String getShip_country() {
		return ship_country;
	}

	public void setShip_country(String ship_country) {
		this.ship_country = ship_country;
	}

	public String getShip_pincode() {
		return ship_pincode;
	}

	public void setShip_pincode(String ship_pincode) {
		this.ship_pincode = ship_pincode;
	}

	public String getShip_phone1() {
		return ship_phone1;
	}

	public void setShip_phone1(String ship_phone1) {
		this.ship_phone1 = ship_phone1;
	}

	public String getShip_phone2() {
		return ship_phone2;
	}

	public void setShip_phone2(String ship_phone2) {
		this.ship_phone2 = ship_phone2;
	}

	public String getShip_email1() {
		return ship_email1;
	}

	public void setShip_email1(String ship_email1) {
		this.ship_email1 = ship_email1;
	}

	public String getShip_email2() {
		return ship_email2;
	}

	public void setShip_email2(String ship_email2) {
		this.ship_email2 = ship_email2;
	}

	public String getBill_name() {
		return bill_name;
	}

	public void setBill_name(String bill_name) {
		this.bill_name = bill_name;
	}

	public String getBill_address1() {
		return bill_address1;
	}

	public void setBill_address1(String bill_address1) {
		this.bill_address1 = bill_address1;
	}

	public String getBill_address2() {
		return bill_address2;
	}

	public void setBill_address2(String bill_address2) {
		this.bill_address2 = bill_address2;
	}

	public String getBill_address3() {
		return bill_address3;
	}

	public void setBill_address3(String bill_address3) {
		this.bill_address3 = bill_address3;
	}

	public String getBill_address4() {
		return bill_address4;
	}

	public void setBill_address4(String bill_address4) {
		this.bill_address4 = bill_address4;
	}

	public String getBill_city() {
		return bill_city;
	}

	public void setBill_city(String bill_city) {
		this.bill_city = bill_city;
	}

	public String getBill_state() {
		return bill_state;
	}

	public void setBill_state(String bill_state) {
		this.bill_state = bill_state;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBill_country() {
		return bill_country;
	}

	public void setBill_country(String bill_country) {
		this.bill_country = bill_country;
	}

	public String getBill_pincode() {
		return bill_pincode;
	}

	public void setBill_pincode(String bill_pincode) {
		this.bill_pincode = bill_pincode;
	}

	public String getBill_phone1() {
		return bill_phone1;
	}

	public void setBill_phone1(String bill_phone1) {
		this.bill_phone1 = bill_phone1;
	}

	public String getBill_phone2() {
		return bill_phone2;
	}

	public void setBill_phone2(String bill_phone2) {
		this.bill_phone2 = bill_phone2;
	}

	public String getBill_email1() {
		return bill_email1;
	}

	public void setBill_email1(String bill_email1) {
		this.bill_email1 = bill_email1;
	}

	public String getBill_email2() {
		return bill_email2;
	}

	public void setBill_email2(String bill_email2) {
		this.bill_email2 = bill_email2;
	}

	public String getOrder_remarks() {
		return order_remarks;
	}

	public void setOrder_remarks(String order_remarks) {
		this.order_remarks = order_remarks;
	}

	public String getShipping_charges() {
		return shipping_charges;
	}

	public void setShipping_charges(String shipping_charges) {
		this.shipping_charges = shipping_charges;
	}

	public String getOther_charge1() {
		return other_charge1;
	}

	public void setOther_charge1(String other_charge1) {
		this.other_charge1 = other_charge1;
	}

	public String getOther_charge2() {
		return other_charge2;
	}

	public void setOther_charge2(String other_charge2) {
		this.other_charge2 = other_charge2;
	}

	public String getStore_credit() {
		return store_credit;
	}

	public void setStore_credit(String store_credit) {
		this.store_credit = store_credit;
	}

	public String getOther_discount() {
		return other_discount;
	}

	public void setOther_discount(String other_discount) {
		this.other_discount = other_discount;
	}

	public String getCancel_remark() {
		return cancel_remark;
	}

	public void setCancel_remark(String cancel_remark) {
		this.cancel_remark = cancel_remark;
	}

	public String getUdf1() {
		return udf1;
	}

	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}

	public String getUdf2() {
		return udf2;
	}

	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}

	public String getUdf3() {
		return udf3;
	}

	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}

	public String getUdf4() {
		return udf4;
	}

	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}

	public String getUdf5() {
		return udf5;
	}

	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}

	public String getUdf6() {
		return udf6;
	}

	public void setUdf6(String udf6) {
		this.udf6 = udf6;
	}

	public String getUdf7() {
		return udf7;
	}

	public void setUdf7(String udf7) {
		this.udf7 = udf7;
	}

	public String getUdf8() {
		return udf8;
	}

	public void setUdf8(String udf8) {
		this.udf8 = udf8;
	}

	public String getUdf9() {
		return udf9;
	}

	public void setUdf9(String udf9) {
		this.udf9 = udf9;
	}

	public String getUdf10() {
		return udf10;
	}

	public void setUdf10(String udf10) {
		this.udf10 = udf10;
	}

	public String getCustTinNo() {
		return custTinNo;
	}

	public void setCustTinNo(String custTinNo) {
		this.custTinNo = custTinNo;
	}

	public String getPickAfterDate() {
		return pickAfterDate;
	}

	public void setPickAfterDate(String pickAfterDate) {
		this.pickAfterDate = pickAfterDate;
	}

	public Object getGiftwrapCharge() {
		return giftwrapCharge;
	}

	public void setGiftwrapCharge(Object giftwrapCharge) {
		this.giftwrapCharge = giftwrapCharge;
	}

	public Object getGvAmount() {
		return gvAmount;
	}

	public void setGvAmount(Object gvAmount) {
		this.gvAmount = gvAmount;
	}

	public Integer getRewardPointsAmount() {
		return rewardPointsAmount;
	}

	public void setRewardPointsAmount(Integer rewardPointsAmount) {
		this.rewardPointsAmount = rewardPointsAmount;
	}

	public String getCust_type() {
		return cust_type;
	}

	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	public String getReq_type() {
		return req_type;
	}

	public void setReq_type(String req_type) {
		this.req_type = req_type;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<PaymentItem> getPaymentItems() {
		return paymentItems;
	}

	public void setPaymentItems(List<PaymentItem> paymentItems) {
		this.paymentItems = paymentItems;
	}
}
