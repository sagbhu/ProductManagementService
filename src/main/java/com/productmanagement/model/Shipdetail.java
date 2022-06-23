package com.productmanagement.model;

import java.util.List;
import java.util.Objects;

public class Shipdetail {
	private String qty;
	private String transporter;
	private String transporterstatusremark;
	private String transporterstatus;
	private String shipdate;
	private String updated_date;
	private String delivereddate;
	private String refereceNo;
	private String tracking_number;
	private String status;
	private String expdeldate_min;
	private String expdeldate_max;
	private String cp_id;
	private String mode;
	private String collectible_amount;
	private String allocation_date;
	private String pick_date;
	private String pack_date;
	private String rollback_flag;
	private String shipment_value;
	private String account_id;
	private String length;
	private String breadth;
	private String height;
	private String weight;
	private String invoiceDate;
	private List<Item> item;

	/**
	 * @return the qty
	 */
	public String getQty() {
		return qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(String qty) {
		this.qty = qty;
	}

	/**
	 * @return the transporter
	 */
	public String getTransporter() {
		return transporter;
	}

	/**
	 * @param transporter the transporter to set
	 */
	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}

	/**
	 * @return the transporterstatusremark
	 */
	public String getTransporterstatusremark() {
		return transporterstatusremark;
	}

	/**
	 * @param transporterstatusremark the transporterstatusremark to set
	 */
	public void setTransporterstatusremark(String transporterstatusremark) {
		this.transporterstatusremark = transporterstatusremark;
	}

	/**
	 * @return the transporterstatus
	 */
	public String getTransporterstatus() {
		return transporterstatus;
	}

	/**
	 * @param transporterstatus the transporterstatus to set
	 */
	public void setTransporterstatus(String transporterstatus) {
		this.transporterstatus = transporterstatus;
	}

	/**
	 * @return the shipdate
	 */
	public String getShipdate() {
		return shipdate;
	}

	/**
	 * @param shipdate the shipdate to set
	 */
	public void setShipdate(String shipdate) {
		this.shipdate = shipdate;
	}

	/**
	 * @return the updated_date
	 */
	public String getUpdated_date() {
		return updated_date;
	}

	/**
	 * @param updated_date the updated_date to set
	 */
	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}

	/**
	 * @return the delivereddate
	 */
	public String getDelivereddate() {
		return delivereddate;
	}

	/**
	 * @param delivereddate the delivereddate to set
	 */
	public void setDelivereddate(String delivereddate) {
		this.delivereddate = delivereddate;
	}

	/**
	 * @return the refereceNo
	 */
	public String getRefereceNo() {
		return refereceNo;
	}

	/**
	 * @param refereceNo the refereceNo to set
	 */
	public void setRefereceNo(String refereceNo) {
		this.refereceNo = refereceNo;
	}

	/**
	 * @return the tracking_number
	 */
	public String getTracking_number() {
		return tracking_number;
	}

	/**
	 * @param tracking_number the tracking_number to set
	 */
	public void setTracking_number(String tracking_number) {
		this.tracking_number = tracking_number;
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
	 * @return the expdeldate_min
	 */
	public String getExpdeldate_min() {
		return expdeldate_min;
	}

	/**
	 * @param expdeldate_min the expdeldate_min to set
	 */
	public void setExpdeldate_min(String expdeldate_min) {
		this.expdeldate_min = expdeldate_min;
	}

	/**
	 * @return the expdeldate_max
	 */
	public String getExpdeldate_max() {
		return expdeldate_max;
	}

	/**
	 * @param expdeldate_max the expdeldate_max to set
	 */
	public void setExpdeldate_max(String expdeldate_max) {
		this.expdeldate_max = expdeldate_max;
	}

	/**
	 * @return the cp_id
	 */
	public String getCp_id() {
		return cp_id;
	}

	/**
	 * @param cp_id the cp_id to set
	 */
	public void setCp_id(String cp_id) {
		this.cp_id = cp_id;
	}

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @return the collectible_amount
	 */
	public String getCollectible_amount() {
		return collectible_amount;
	}

	/**
	 * @param collectible_amount the collectible_amount to set
	 */
	public void setCollectible_amount(String collectible_amount) {
		this.collectible_amount = collectible_amount;
	}

	/**
	 * @return the allocation_date
	 */
	public String getAllocation_date() {
		return allocation_date;
	}

	/**
	 * @param allocation_date the allocation_date to set
	 */
	public void setAllocation_date(String allocation_date) {
		this.allocation_date = allocation_date;
	}

	/**
	 * @return the pick_date
	 */
	public String getPick_date() {
		return pick_date;
	}

	/**
	 * @param pick_date the pick_date to set
	 */
	public void setPick_date(String pick_date) {
		this.pick_date = pick_date;
	}

	/**
	 * @return the pack_date
	 */
	public String getPack_date() {
		return pack_date;
	}

	/**
	 * @param pack_date the pack_date to set
	 */
	public void setPack_date(String pack_date) {
		this.pack_date = pack_date;
	}

	/**
	 * @return the rollback_flag
	 */
	public String getRollback_flag() {
		return rollback_flag;
	}

	/**
	 * @param rollback_flag the rollback_flag to set
	 */
	public void setRollback_flag(String rollback_flag) {
		this.rollback_flag = rollback_flag;
	}

	/**
	 * @return the shipment_value
	 */
	public String getShipment_value() {
		return shipment_value;
	}

	/**
	 * @param shipment_value the shipment_value to set
	 */
	public void setShipment_value(String shipment_value) {
		this.shipment_value = shipment_value;
	}

	/**
	 * @return the account_id
	 */
	public String getAccount_id() {
		return account_id;
	}

	/**
	 * @param account_id the account_id to set
	 */
	public void setAccount_id(String account_id) {
		this.account_id = account_id;
	}

	/**
	 * @return the length
	 */
	public String getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(String length) {
		this.length = length;
	}

	/**
	 * @return the breadth
	 */
	public String getBreadth() {
		return breadth;
	}

	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(String breadth) {
		this.breadth = breadth;
	}

	/**
	 * @return the height
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * @return the invoiceDate
	 */
	public String getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	/**
	 * @return the item
	 */
	public List<Item> getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(List<Item> item) {
		this.item = item;
	}

	@Override
	public int hashCode() {
		return Objects.hash(account_id, allocation_date, breadth, collectible_amount, cp_id, delivereddate,
				expdeldate_max, expdeldate_min, height, invoiceDate, item, length, mode, pack_date, pick_date, qty,
				refereceNo, rollback_flag, shipdate, shipment_value, status, tracking_number, transporter,
				transporterstatus, transporterstatusremark, updated_date, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shipdetail other = (Shipdetail) obj;
		return Objects.equals(account_id, other.account_id) && Objects.equals(allocation_date, other.allocation_date)
				&& Objects.equals(breadth, other.breadth)
				&& Objects.equals(collectible_amount, other.collectible_amount) && Objects.equals(cp_id, other.cp_id)
				&& Objects.equals(delivereddate, other.delivereddate)
				&& Objects.equals(expdeldate_max, other.expdeldate_max)
				&& Objects.equals(expdeldate_min, other.expdeldate_min) && Objects.equals(height, other.height)
				&& Objects.equals(invoiceDate, other.invoiceDate) && Objects.equals(item, other.item)
				&& Objects.equals(length, other.length) && Objects.equals(mode, other.mode)
				&& Objects.equals(pack_date, other.pack_date) && Objects.equals(pick_date, other.pick_date)
				&& Objects.equals(qty, other.qty) && Objects.equals(refereceNo, other.refereceNo)
				&& Objects.equals(rollback_flag, other.rollback_flag) && Objects.equals(shipdate, other.shipdate)
				&& Objects.equals(shipment_value, other.shipment_value) && Objects.equals(status, other.status)
				&& Objects.equals(tracking_number, other.tracking_number)
				&& Objects.equals(transporter, other.transporter)
				&& Objects.equals(transporterstatus, other.transporterstatus)
				&& Objects.equals(transporterstatusremark, other.transporterstatusremark)
				&& Objects.equals(updated_date, other.updated_date) && Objects.equals(weight, other.weight);
	}

}
