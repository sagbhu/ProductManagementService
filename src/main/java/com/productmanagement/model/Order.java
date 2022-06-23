package com.productmanagement.model;

import java.util.List;
import java.util.Objects;

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
	private String giftwrapCharge;
	private String gvAmount;
	private String rewardPointsAmount;
	private String cust_type;
	private String req_type;
	private String pickupLocation;
	private List<Shipdetail> shipdetail;

	/**
	 * @return the order_location
	 */
	public String getOrder_location() {
		return order_location;
	}

	/**
	 * @param order_location the order_location to set
	 */
	public void setOrder_location(String order_location) {
		this.order_location = order_location;
	}

	/**
	 * @return the uniqueKey
	 */
	public String getUniqueKey() {
		return uniqueKey;
	}

	/**
	 * @param uniqueKey the uniqueKey to set
	 */
	public void setUniqueKey(String uniqueKey) {
		this.uniqueKey = uniqueKey;
	}

	/**
	 * @return the order_no
	 */
	public String getOrder_no() {
		return order_no;
	}

	/**
	 * @param order_no the order_no to set
	 */
	public void setOrder_no(String order_no) {
		this.order_no = order_no;
	}

	/**
	 * @return the order_type
	 */
	public String getOrder_type() {
		return order_type;
	}

	/**
	 * @param order_type the order_type to set
	 */
	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	/**
	 * @return the payment_type
	 */
	public String getPayment_type() {
		return payment_type;
	}

	/**
	 * @param payment_type the payment_type to set
	 */
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	/**
	 * @return the awbNo
	 */
	public String getAwbNo() {
		return awbNo;
	}

	/**
	 * @param awbNo the awbNo to set
	 */
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the hold_status
	 */
	public String getHold_status() {
		return hold_status;
	}

	/**
	 * @param hold_status the hold_status to set
	 */
	public void setHold_status(String hold_status) {
		this.hold_status = hold_status;
	}

	/**
	 * @return the address_verified
	 */
	public String getAddress_verified() {
		return address_verified;
	}

	/**
	 * @param address_verified the address_verified to set
	 */
	public void setAddress_verified(String address_verified) {
		this.address_verified = address_verified;
	}

	/**
	 * @return the payment_verified
	 */
	public String getPayment_verified() {
		return payment_verified;
	}

	/**
	 * @param payment_verified the payment_verified to set
	 */
	public void setPayment_verified(String payment_verified) {
		this.payment_verified = payment_verified;
	}

	/**
	 * @return the address_type
	 */
	public String getAddress_type() {
		return address_type;
	}

	/**
	 * @param address_type the address_type to set
	 */
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}

	/**
	 * @return the order_amount
	 */
	public String getOrder_amount() {
		return order_amount;
	}

	/**
	 * @param order_amount the order_amount to set
	 */
	public void setOrder_amount(String order_amount) {
		this.order_amount = order_amount;
	}

	/**
	 * @return the order_date
	 */
	public String getOrder_date() {
		return order_date;
	}

	/**
	 * @param order_date the order_date to set
	 */
	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	/**
	 * @return the shipby_date
	 */
	public String getShipby_date() {
		return shipby_date;
	}

	/**
	 * @param shipby_date the shipby_date to set
	 */
	public void setShipby_date(String shipby_date) {
		this.shipby_date = shipby_date;
	}

	/**
	 * @return the order_currency
	 */
	public String getOrder_currency() {
		return order_currency;
	}

	/**
	 * @param order_currency the order_currency to set
	 */
	public void setOrder_currency(String order_currency) {
		this.order_currency = order_currency;
	}

	/**
	 * @return the conversion_rate
	 */
	public String getConversion_rate() {
		return conversion_rate;
	}

	/**
	 * @param conversion_rate the conversion_rate to set
	 */
	public void setConversion_rate(String conversion_rate) {
		this.conversion_rate = conversion_rate;
	}

	/**
	 * @return the is_replacement
	 */
	public String getIs_replacement() {
		return is_replacement;
	}

	/**
	 * @param is_replacement the is_replacement to set
	 */
	public void setIs_replacement(String is_replacement) {
		this.is_replacement = is_replacement;
	}

	/**
	 * @return the original_orderno
	 */
	public String getOriginal_orderno() {
		return original_orderno;
	}

	/**
	 * @param original_orderno the original_orderno to set
	 */
	public void setOriginal_orderno(String original_orderno) {
		this.original_orderno = original_orderno;
	}

	/**
	 * @return the customer_code
	 */
	public String getCustomer_code() {
		return customer_code;
	}

	/**
	 * @param customer_code the customer_code to set
	 */
	public void setCustomer_code(String customer_code) {
		this.customer_code = customer_code;
	}

	/**
	 * @return the extCustomerCode
	 */
	public String getExtCustomerCode() {
		return extCustomerCode;
	}

	/**
	 * @param extCustomerCode the extCustomerCode to set
	 */
	public void setExtCustomerCode(String extCustomerCode) {
		this.extCustomerCode = extCustomerCode;
	}

	/**
	 * @return the customer_name
	 */
	public String getCustomer_name() {
		return customer_name;
	}

	/**
	 * @param customer_name the customer_name to set
	 */
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	/**
	 * @return the ship_address1
	 */
	public String getShip_address1() {
		return ship_address1;
	}

	/**
	 * @param ship_address1 the ship_address1 to set
	 */
	public void setShip_address1(String ship_address1) {
		this.ship_address1 = ship_address1;
	}

	/**
	 * @return the ship_address2
	 */
	public String getShip_address2() {
		return ship_address2;
	}

	/**
	 * @param ship_address2 the ship_address2 to set
	 */
	public void setShip_address2(String ship_address2) {
		this.ship_address2 = ship_address2;
	}

	/**
	 * @return the ship_address3
	 */
	public String getShip_address3() {
		return ship_address3;
	}

	/**
	 * @param ship_address3 the ship_address3 to set
	 */
	public void setShip_address3(String ship_address3) {
		this.ship_address3 = ship_address3;
	}

	/**
	 * @return the ship_address4
	 */
	public String getShip_address4() {
		return ship_address4;
	}

	/**
	 * @param ship_address4 the ship_address4 to set
	 */
	public void setShip_address4(String ship_address4) {
		this.ship_address4 = ship_address4;
	}

	/**
	 * @return the ship_city
	 */
	public String getShip_city() {
		return ship_city;
	}

	/**
	 * @param ship_city the ship_city to set
	 */
	public void setShip_city(String ship_city) {
		this.ship_city = ship_city;
	}

	/**
	 * @return the ship_state
	 */
	public String getShip_state() {
		return ship_state;
	}

	/**
	 * @param ship_state the ship_state to set
	 */
	public void setShip_state(String ship_state) {
		this.ship_state = ship_state;
	}

	/**
	 * @return the ship_country
	 */
	public String getShip_country() {
		return ship_country;
	}

	/**
	 * @param ship_country the ship_country to set
	 */
	public void setShip_country(String ship_country) {
		this.ship_country = ship_country;
	}

	/**
	 * @return the ship_pincode
	 */
	public String getShip_pincode() {
		return ship_pincode;
	}

	/**
	 * @param ship_pincode the ship_pincode to set
	 */
	public void setShip_pincode(String ship_pincode) {
		this.ship_pincode = ship_pincode;
	}

	/**
	 * @return the ship_phone1
	 */
	public String getShip_phone1() {
		return ship_phone1;
	}

	/**
	 * @param ship_phone1 the ship_phone1 to set
	 */
	public void setShip_phone1(String ship_phone1) {
		this.ship_phone1 = ship_phone1;
	}

	/**
	 * @return the ship_phone2
	 */
	public String getShip_phone2() {
		return ship_phone2;
	}

	/**
	 * @param ship_phone2 the ship_phone2 to set
	 */
	public void setShip_phone2(String ship_phone2) {
		this.ship_phone2 = ship_phone2;
	}

	/**
	 * @return the ship_email1
	 */
	public String getShip_email1() {
		return ship_email1;
	}

	/**
	 * @param ship_email1 the ship_email1 to set
	 */
	public void setShip_email1(String ship_email1) {
		this.ship_email1 = ship_email1;
	}

	/**
	 * @return the ship_email2
	 */
	public String getShip_email2() {
		return ship_email2;
	}

	/**
	 * @param ship_email2 the ship_email2 to set
	 */
	public void setShip_email2(String ship_email2) {
		this.ship_email2 = ship_email2;
	}

	/**
	 * @return the bill_name
	 */
	public String getBill_name() {
		return bill_name;
	}

	/**
	 * @param bill_name the bill_name to set
	 */
	public void setBill_name(String bill_name) {
		this.bill_name = bill_name;
	}

	/**
	 * @return the bill_address1
	 */
	public String getBill_address1() {
		return bill_address1;
	}

	/**
	 * @param bill_address1 the bill_address1 to set
	 */
	public void setBill_address1(String bill_address1) {
		this.bill_address1 = bill_address1;
	}

	/**
	 * @return the bill_address2
	 */
	public String getBill_address2() {
		return bill_address2;
	}

	/**
	 * @param bill_address2 the bill_address2 to set
	 */
	public void setBill_address2(String bill_address2) {
		this.bill_address2 = bill_address2;
	}

	/**
	 * @return the bill_address3
	 */
	public String getBill_address3() {
		return bill_address3;
	}

	/**
	 * @param bill_address3 the bill_address3 to set
	 */
	public void setBill_address3(String bill_address3) {
		this.bill_address3 = bill_address3;
	}

	/**
	 * @return the bill_address4
	 */
	public String getBill_address4() {
		return bill_address4;
	}

	/**
	 * @param bill_address4 the bill_address4 to set
	 */
	public void setBill_address4(String bill_address4) {
		this.bill_address4 = bill_address4;
	}

	/**
	 * @return the bill_city
	 */
	public String getBill_city() {
		return bill_city;
	}

	/**
	 * @param bill_city the bill_city to set
	 */
	public void setBill_city(String bill_city) {
		this.bill_city = bill_city;
	}

	/**
	 * @return the bill_state
	 */
	public String getBill_state() {
		return bill_state;
	}

	/**
	 * @param bill_state the bill_state to set
	 */
	public void setBill_state(String bill_state) {
		this.bill_state = bill_state;
	}

	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}

	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the bill_country
	 */
	public String getBill_country() {
		return bill_country;
	}

	/**
	 * @param bill_country the bill_country to set
	 */
	public void setBill_country(String bill_country) {
		this.bill_country = bill_country;
	}

	/**
	 * @return the bill_pincode
	 */
	public String getBill_pincode() {
		return bill_pincode;
	}

	/**
	 * @param bill_pincode the bill_pincode to set
	 */
	public void setBill_pincode(String bill_pincode) {
		this.bill_pincode = bill_pincode;
	}

	/**
	 * @return the bill_phone1
	 */
	public String getBill_phone1() {
		return bill_phone1;
	}

	/**
	 * @param bill_phone1 the bill_phone1 to set
	 */
	public void setBill_phone1(String bill_phone1) {
		this.bill_phone1 = bill_phone1;
	}

	/**
	 * @return the bill_phone2
	 */
	public String getBill_phone2() {
		return bill_phone2;
	}

	/**
	 * @param bill_phone2 the bill_phone2 to set
	 */
	public void setBill_phone2(String bill_phone2) {
		this.bill_phone2 = bill_phone2;
	}

	/**
	 * @return the bill_email1
	 */
	public String getBill_email1() {
		return bill_email1;
	}

	/**
	 * @param bill_email1 the bill_email1 to set
	 */
	public void setBill_email1(String bill_email1) {
		this.bill_email1 = bill_email1;
	}

	/**
	 * @return the bill_email2
	 */
	public String getBill_email2() {
		return bill_email2;
	}

	/**
	 * @param bill_email2 the bill_email2 to set
	 */
	public void setBill_email2(String bill_email2) {
		this.bill_email2 = bill_email2;
	}

	/**
	 * @return the order_remarks
	 */
	public String getOrder_remarks() {
		return order_remarks;
	}

	/**
	 * @param order_remarks the order_remarks to set
	 */
	public void setOrder_remarks(String order_remarks) {
		this.order_remarks = order_remarks;
	}

	/**
	 * @return the shipping_charges
	 */
	public String getShipping_charges() {
		return shipping_charges;
	}

	/**
	 * @param shipping_charges the shipping_charges to set
	 */
	public void setShipping_charges(String shipping_charges) {
		this.shipping_charges = shipping_charges;
	}

	/**
	 * @return the other_charge1
	 */
	public String getOther_charge1() {
		return other_charge1;
	}

	/**
	 * @param other_charge1 the other_charge1 to set
	 */
	public void setOther_charge1(String other_charge1) {
		this.other_charge1 = other_charge1;
	}

	/**
	 * @return the other_charge2
	 */
	public String getOther_charge2() {
		return other_charge2;
	}

	/**
	 * @param other_charge2 the other_charge2 to set
	 */
	public void setOther_charge2(String other_charge2) {
		this.other_charge2 = other_charge2;
	}

	/**
	 * @return the store_credit
	 */
	public String getStore_credit() {
		return store_credit;
	}

	/**
	 * @param store_credit the store_credit to set
	 */
	public void setStore_credit(String store_credit) {
		this.store_credit = store_credit;
	}

	/**
	 * @return the other_discount
	 */
	public String getOther_discount() {
		return other_discount;
	}

	/**
	 * @param other_discount the other_discount to set
	 */
	public void setOther_discount(String other_discount) {
		this.other_discount = other_discount;
	}

	/**
	 * @return the cancel_remark
	 */
	public String getCancel_remark() {
		return cancel_remark;
	}

	/**
	 * @param cancel_remark the cancel_remark to set
	 */
	public void setCancel_remark(String cancel_remark) {
		this.cancel_remark = cancel_remark;
	}

	/**
	 * @return the udf1
	 */
	public String getUdf1() {
		return udf1;
	}

	/**
	 * @param udf1 the udf1 to set
	 */
	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}

	/**
	 * @return the udf2
	 */
	public String getUdf2() {
		return udf2;
	}

	/**
	 * @param udf2 the udf2 to set
	 */
	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}

	/**
	 * @return the udf3
	 */
	public String getUdf3() {
		return udf3;
	}

	/**
	 * @param udf3 the udf3 to set
	 */
	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}

	/**
	 * @return the udf4
	 */
	public String getUdf4() {
		return udf4;
	}

	/**
	 * @param udf4 the udf4 to set
	 */
	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}

	/**
	 * @return the udf5
	 */
	public String getUdf5() {
		return udf5;
	}

	/**
	 * @param udf5 the udf5 to set
	 */
	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}

	/**
	 * @return the udf6
	 */
	public String getUdf6() {
		return udf6;
	}

	/**
	 * @param udf6 the udf6 to set
	 */
	public void setUdf6(String udf6) {
		this.udf6 = udf6;
	}

	/**
	 * @return the udf7
	 */
	public String getUdf7() {
		return udf7;
	}

	/**
	 * @param udf7 the udf7 to set
	 */
	public void setUdf7(String udf7) {
		this.udf7 = udf7;
	}

	/**
	 * @return the udf8
	 */
	public String getUdf8() {
		return udf8;
	}

	/**
	 * @param udf8 the udf8 to set
	 */
	public void setUdf8(String udf8) {
		this.udf8 = udf8;
	}

	/**
	 * @return the udf9
	 */
	public String getUdf9() {
		return udf9;
	}

	/**
	 * @param udf9 the udf9 to set
	 */
	public void setUdf9(String udf9) {
		this.udf9 = udf9;
	}

	/**
	 * @return the udf10
	 */
	public String getUdf10() {
		return udf10;
	}

	/**
	 * @param udf10 the udf10 to set
	 */
	public void setUdf10(String udf10) {
		this.udf10 = udf10;
	}

	/**
	 * @return the custTinNo
	 */
	public String getCustTinNo() {
		return custTinNo;
	}

	/**
	 * @param custTinNo the custTinNo to set
	 */
	public void setCustTinNo(String custTinNo) {
		this.custTinNo = custTinNo;
	}

	/**
	 * @return the pickAfterDate
	 */
	public String getPickAfterDate() {
		return pickAfterDate;
	}

	/**
	 * @param pickAfterDate the pickAfterDate to set
	 */
	public void setPickAfterDate(String pickAfterDate) {
		this.pickAfterDate = pickAfterDate;
	}

	/**
	 * @return the giftwrapCharge
	 */
	public String getGiftwrapCharge() {
		return giftwrapCharge;
	}

	/**
	 * @param giftwrapCharge the giftwrapCharge to set
	 */
	public void setGiftwrapCharge(String giftwrapCharge) {
		this.giftwrapCharge = giftwrapCharge;
	}

	/**
	 * @return the gvAmount
	 */
	public String getGvAmount() {
		return gvAmount;
	}

	/**
	 * @param gvAmount the gvAmount to set
	 */
	public void setGvAmount(String gvAmount) {
		this.gvAmount = gvAmount;
	}

	/**
	 * @return the rewardPointsAmount
	 */
	public String getRewardPointsAmount() {
		return rewardPointsAmount;
	}

	/**
	 * @param rewardPointsAmount the rewardPointsAmount to set
	 */
	public void setRewardPointsAmount(String rewardPointsAmount) {
		this.rewardPointsAmount = rewardPointsAmount;
	}

	/**
	 * @return the cust_type
	 */
	public String getCust_type() {
		return cust_type;
	}

	/**
	 * @param cust_type the cust_type to set
	 */
	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}

	/**
	 * @return the req_type
	 */
	public String getReq_type() {
		return req_type;
	}

	/**
	 * @param req_type the req_type to set
	 */
	public void setReq_type(String req_type) {
		this.req_type = req_type;
	}

	/**
	 * @return the pickupLocation
	 */
	public String getPickupLocation() {
		return pickupLocation;
	}

	/**
	 * @param pickupLocation the pickupLocation to set
	 */
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	/**
	 * @return the shipdetail
	 */
	public List<Shipdetail> getShipdetail() {
		return shipdetail;
	}

	/**
	 * @param shipdetail the shipdetail to set
	 */
	public void setShipdetail(List<Shipdetail> shipdetail) {
		this.shipdetail = shipdetail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address_type, address_verified, awbNo, bill_address1, bill_address2, bill_address3,
				bill_address4, bill_city, bill_country, bill_email1, bill_email2, bill_name, bill_phone1, bill_phone2,
				bill_pincode, bill_state, cancel_remark, conversion_rate, custTinNo, cust_type, customer_code,
				customer_name, extCustomerCode, giftwrapCharge, gvAmount, hold_status, is_replacement, landmark,
				latitude, longitude, order_amount, order_currency, order_date, order_location, order_no, order_remarks,
				order_type, original_orderno, other_charge1, other_charge2, other_discount, payment_type,
				payment_verified, pickAfterDate, pickupLocation, req_type, rewardPointsAmount, ship_address1,
				ship_address2, ship_address3, ship_address4, ship_city, ship_country, ship_email1, ship_email2,
				ship_phone1, ship_phone2, ship_pincode, ship_state, shipby_date, shipdetail, shipping_charges, status,
				store_credit, udf1, udf10, udf2, udf3, udf4, udf5, udf6, udf7, udf8, udf9, uniqueKey, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(address_type, other.address_type)
				&& Objects.equals(address_verified, other.address_verified) && Objects.equals(awbNo, other.awbNo)
				&& Objects.equals(bill_address1, other.bill_address1)
				&& Objects.equals(bill_address2, other.bill_address2)
				&& Objects.equals(bill_address3, other.bill_address3)
				&& Objects.equals(bill_address4, other.bill_address4) && Objects.equals(bill_city, other.bill_city)
				&& Objects.equals(bill_country, other.bill_country) && Objects.equals(bill_email1, other.bill_email1)
				&& Objects.equals(bill_email2, other.bill_email2) && Objects.equals(bill_name, other.bill_name)
				&& Objects.equals(bill_phone1, other.bill_phone1) && Objects.equals(bill_phone2, other.bill_phone2)
				&& Objects.equals(bill_pincode, other.bill_pincode) && Objects.equals(bill_state, other.bill_state)
				&& Objects.equals(cancel_remark, other.cancel_remark)
				&& Objects.equals(conversion_rate, other.conversion_rate) && Objects.equals(custTinNo, other.custTinNo)
				&& Objects.equals(cust_type, other.cust_type) && Objects.equals(customer_code, other.customer_code)
				&& Objects.equals(customer_name, other.customer_name)
				&& Objects.equals(extCustomerCode, other.extCustomerCode)
				&& Objects.equals(giftwrapCharge, other.giftwrapCharge) && Objects.equals(gvAmount, other.gvAmount)
				&& Objects.equals(hold_status, other.hold_status)
				&& Objects.equals(is_replacement, other.is_replacement) && Objects.equals(landmark, other.landmark)
				&& Objects.equals(latitude, other.latitude) && Objects.equals(longitude, other.longitude)
				&& Objects.equals(order_amount, other.order_amount)
				&& Objects.equals(order_currency, other.order_currency) && Objects.equals(order_date, other.order_date)
				&& Objects.equals(order_location, other.order_location) && Objects.equals(order_no, other.order_no)
				&& Objects.equals(order_remarks, other.order_remarks) && Objects.equals(order_type, other.order_type)
				&& Objects.equals(original_orderno, other.original_orderno)
				&& Objects.equals(other_charge1, other.other_charge1)
				&& Objects.equals(other_charge2, other.other_charge2)
				&& Objects.equals(other_discount, other.other_discount)
				&& Objects.equals(payment_type, other.payment_type)
				&& Objects.equals(payment_verified, other.payment_verified)
				&& Objects.equals(pickAfterDate, other.pickAfterDate)
				&& Objects.equals(pickupLocation, other.pickupLocation) && Objects.equals(req_type, other.req_type)
				&& Objects.equals(rewardPointsAmount, other.rewardPointsAmount)
				&& Objects.equals(ship_address1, other.ship_address1)
				&& Objects.equals(ship_address2, other.ship_address2)
				&& Objects.equals(ship_address3, other.ship_address3)
				&& Objects.equals(ship_address4, other.ship_address4) && Objects.equals(ship_city, other.ship_city)
				&& Objects.equals(ship_country, other.ship_country) && Objects.equals(ship_email1, other.ship_email1)
				&& Objects.equals(ship_email2, other.ship_email2) && Objects.equals(ship_phone1, other.ship_phone1)
				&& Objects.equals(ship_phone2, other.ship_phone2) && Objects.equals(ship_pincode, other.ship_pincode)
				&& Objects.equals(ship_state, other.ship_state) && Objects.equals(shipby_date, other.shipby_date)
				&& Objects.equals(shipdetail, other.shipdetail)
				&& Objects.equals(shipping_charges, other.shipping_charges) && Objects.equals(status, other.status)
				&& Objects.equals(store_credit, other.store_credit) && Objects.equals(udf1, other.udf1)
				&& Objects.equals(udf10, other.udf10) && Objects.equals(udf2, other.udf2)
				&& Objects.equals(udf3, other.udf3) && Objects.equals(udf4, other.udf4)
				&& Objects.equals(udf5, other.udf5) && Objects.equals(udf6, other.udf6)
				&& Objects.equals(udf7, other.udf7) && Objects.equals(udf8, other.udf8)
				&& Objects.equals(udf9, other.udf9) && Objects.equals(uniqueKey, other.uniqueKey)
				&& Objects.equals(url, other.url);
	}

}
