package com.productmanagement.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SkuList {
	private String createDateText;
	private String modifiedDateText;
	private List<Object> searchList;
	private String skuCode;
	private String uId;
	private String displaySKUCode;
	private String skuName;
	private String skuClassification;
	private String skuClassificationText;
	private String styleSKUCode;
	private String approveStatus;
	private String approveStatusText;
	private String productStatus;
	private String productStatusText;
	private Integer imgCount;
	private String brand;
	private String brandText;
	private String merchId;
	private String merchIdText;
	private String skuImgUrl1;
	private Double msrp;
	private Double basePrice;
	private Double salePrice;
	private Double height;
	private Double width;
	private Double weight;
	private Double length;
	private CatAtribMap catAtribMap;
	private String hsnCode;
	private String variationTheme;
	private String color;
	private Boolean noLimit;
	private Boolean folderWiseImageDownload;
	private String size;

	public String getCreateDateText() {
		return createDateText;
	}

	public void setCreateDateText(String createDateText) {
		this.createDateText = createDateText;
	}

	public String getModifiedDateText() {
		return modifiedDateText;
	}

	public void setModifiedDateText(String modifiedDateText) {
		this.modifiedDateText = modifiedDateText;
	}

	public List<Object> getSearchList() {
		return searchList;
	}

	public void setSearchList(List<Object> searchList) {
		this.searchList = searchList;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getDisplaySKUCode() {
		return displaySKUCode;
	}

	public void setDisplaySKUCode(String displaySKUCode) {
		this.displaySKUCode = displaySKUCode;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getSkuClassification() {
		return skuClassification;
	}

	public void setSkuClassification(String skuClassification) {
		this.skuClassification = skuClassification;
	}

	public String getSkuClassificationText() {
		return skuClassificationText;
	}

	public void setSkuClassificationText(String skuClassificationText) {
		this.skuClassificationText = skuClassificationText;
	}

	public String getStyleSKUCode() {
		return styleSKUCode;
	}

	public void setStyleSKUCode(String styleSKUCode) {
		this.styleSKUCode = styleSKUCode;
	}

	public String getApproveStatus() {
		return approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getApproveStatusText() {
		return approveStatusText;
	}

	public void setApproveStatusText(String approveStatusText) {
		this.approveStatusText = approveStatusText;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public String getProductStatusText() {
		return productStatusText;
	}

	public void setProductStatusText(String productStatusText) {
		this.productStatusText = productStatusText;
	}

	public Integer getImgCount() {
		return imgCount;
	}

	public void setImgCount(Integer imgCount) {
		this.imgCount = imgCount;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrandText() {
		return brandText;
	}

	public void setBrandText(String brandText) {
		this.brandText = brandText;
	}

	public String getMerchId() {
		return merchId;
	}

	public void setMerchId(String merchId) {
		this.merchId = merchId;
	}

	public String getMerchIdText() {
		return merchIdText;
	}

	public void setMerchIdText(String merchIdText) {
		this.merchIdText = merchIdText;
	}

	public String getSkuImgUrl1() {
		return skuImgUrl1;
	}

	public void setSkuImgUrl1(String skuImgUrl1) {
		this.skuImgUrl1 = skuImgUrl1;
	}

	public Double getMsrp() {
		return msrp;
	}

	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}

	public Double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

	public Double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public CatAtribMap getCatAtribMap() {
		return catAtribMap;
	}

	public void setCatAtribMap(CatAtribMap catAtribMap) {
		this.catAtribMap = catAtribMap;
	}

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public String getVariationTheme() {
		return variationTheme;
	}

	public void setVariationTheme(String variationTheme) {
		this.variationTheme = variationTheme;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getNoLimit() {
		return noLimit;
	}

	public void setNoLimit(Boolean noLimit) {
		this.noLimit = noLimit;
	}

	public Boolean getFolderWiseImageDownload() {
		return folderWiseImageDownload;
	}

	public void setFolderWiseImageDownload(Boolean folderWiseImageDownload) {
		this.folderWiseImageDownload = folderWiseImageDownload;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

}
