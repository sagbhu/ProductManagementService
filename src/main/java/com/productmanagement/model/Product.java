package com.productmanagement.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

	@Id
	private String id;

	private String year;

	@JsonProperty("Sleeve-Length ( Inches )")
	private String sleeveLengthInches;

	@JsonProperty("Vendor Name")
	private String vendorName;

	@JsonProperty("Care Instructions")
	private String careInstructions;

	@JsonProperty("Warranty Type")
	private String warrantyType;

	@JsonProperty("ReturnPolicy")
	private String returnPolicy;

	@JsonProperty("Style Color Code")
	private String styleColorCode;

	private String season;

	@JsonProperty("Hood")
	private String hood;

	@JsonProperty("Warranty Description")
	private String warrantyDescription;

	@JsonProperty("dHybrid Size")
	private String dHybridSize;

	@JsonProperty("Warranty Summary")
	private String warrantySummary;

	@JsonProperty("Disclaimer")
	private String disclaimer;

	@JsonProperty("Number of Pockets")
	private String numberOfPockets;

	@JsonProperty("Barcode")
	private String barcode;

	@JsonProperty("Neck Type [Fashion]")
	private String neckTypeFashion;

	@JsonProperty("GST Percentange")
	private String gSTPercentange;

	@JsonProperty("Leaf Category[dHybrid]")
	private String leafCategoryDHybrid;

	@JsonProperty("Material Type [Fashion]")
	private String materialTypeFashion;

	@JsonProperty("Parent Category[dHybrid]")
	private String parentCategoryDHybrid;

	@JsonProperty("Description")
	private String description;

	@JsonProperty("Length [Fashion]")
	private String lengthFashion;

	@JsonProperty("Manufacturer Pin Code")
	private String manufacturerPinCode;

	@JsonProperty("SkuCode")
	private String skuCode;

	@JsonProperty("MRP")
	private int mRP;

	@JsonProperty("Bust (Inches)")
	private String bustInches;

	@JsonProperty("Width")
	private int width;

	@JsonProperty("Pattern")
	private String pattern;

	@JsonProperty("Search Keywords")
	private String searchKeywords;

	@JsonProperty("BaseCost")
	private double baseCost;

	@JsonProperty("Manufacturer Name")
	private String manufacturerName;

	@JsonProperty("Importer Pin Code")
	private String importerPinCode;

	@JsonProperty("Style Name [Tops]")
	private String styleNameTops;

	private String createdDate;

	@JsonProperty("Importer Name")
	private String importerName;

	@JsonProperty("Length")
	private int length;

	@JsonProperty("Pocket")
	private String pocket;

	@JsonProperty("Country Of Origin")
	private String countryOfOrigin;

	@JsonProperty("Image18")
	private String image18;

	@JsonProperty("Image19")
	private String image19;

	@JsonProperty("Image16")
	private String image16;

	@JsonProperty("Image17")
	private String image17;

	@JsonProperty("Across Shoulder (Inches)")
	private String acrossShoulderInches;

	@JsonProperty("Image25")
	private String image25;

	@JsonProperty("Brand Description")
	private String brandDescription;

	@JsonProperty("Image26")
	private String image26;

	@JsonProperty("Image23")
	private String image23;

	@JsonProperty("Image24")
	private String image24;

	@JsonProperty("Image21")
	private String image21;

	@JsonProperty("Image22")
	private String image22;

	@JsonProperty("Image20")
	private String image20;

	@JsonProperty("HSN Code")
	private String hSNCode;

	@JsonProperty("Collar")
	private String collar;

	@JsonProperty("Modifieddate")
	private String modifieddate;

	@JsonProperty("Shipped In(days)")
	private String shippedInDays;

	@JsonProperty("Fabric Composition")
	private String fabricComposition;

	@JsonProperty("Color")
	private String color;

	@JsonProperty("Feature-Jacket")
	private String featureJacket;

	@JsonProperty("Weight")
	private int weight;

	@JsonProperty("Brand")
	private String brand;

	@JsonProperty("Image14")
	private String image14;

	@JsonProperty("Image15")
	private String image15;

	@JsonProperty("Image12")
	private String image12;

	@JsonProperty("Image13")
	private String image13;

	@JsonProperty("Image10")
	private String image10;

	@JsonProperty("Image11")
	private String image11;

	@JsonProperty("Sleeve Type [Fashion]")
	private String sleeveTypeFashion;

	@JsonProperty("Fabric Care")
	private String fabricCare;

	@JsonProperty("SalePrice")
	private int salePrice;

	@JsonProperty("Fit [Tops]")
	private String fitTops;

	@JsonProperty("Manufacturer Address")
	private String manufacturerAddress;

	@JsonProperty("Closure")
	private String closure;

	@JsonProperty("Multipack Set")
	private String multipackSet;

	@JsonProperty("Variation Theme")
	private String variationTheme;

	@JsonProperty("Packer Name and Address with Pincode")
	private String packerNameAndAddressWithPincode;

	@JsonProperty("Chest (Inches)")
	private String chestInches;

	@JsonProperty("Height")
	private int height;

	@JsonProperty("Model Fit")
	private String modelFit;

	@JsonProperty("Image9")
	private String image9;

	@JsonProperty("Image8")
	private String image8;

	@JsonProperty("Image7")
	private String image7;

	@JsonProperty("Image6")
	private String image6;

	@JsonProperty("Importer Address")
	private String importerAddress;

	@JsonProperty("Image5")
	private String image5;

	@JsonProperty("Image4")
	private String image4;

	@JsonProperty("Image3")
	private String image3;

	@JsonProperty("Image2")
	private String image2;

	@JsonProperty("Image1")
	private String image1;

	@JsonProperty("Root Category[dHybrid]")
	private String rootCategoryDHybrid;

	@JsonProperty("Outer Material [Tops]")
	private String outerMaterialTops;

	@JsonProperty("Image29")
	private String image29;

	@JsonProperty("Image27")
	private String image27;

	@JsonProperty("Image28")
	private String image28;

	@JsonProperty("Product Features3")
	private String productFeatures3;

	@JsonProperty("Product Features2")
	private String productFeatures2;

	@JsonProperty("Product Features5")
	private String productFeatures5;

	@JsonProperty("Product Features4")
	private String productFeatures4;

	@JsonProperty("Image30")
	private String image30;

	@JsonProperty("Product Features1")
	private String productFeatures1;

	@JsonProperty("SKUClassification")
	private String sKUClassification;

	@JsonProperty("SkuName")
	private String skuName;

	@JsonProperty("Product Weight [gms]")
	private String productWeightGms;

	private String styleSKUCode;

	@DBRef
	private List<ProductSlug> slug;

	@DBRef
	private ProductLabel label;

	private String intro;

	private String byLine;

	private String desc;

	private String aboutTheBrand;

	private String serviceCode;

	private List<String> keyword;

	private List<String> mixedFile;

	private String file3d;

	private String imageTransition;

	private String videoTransition;

	private String adminTitle;

	private String categoryId;

	@JsonProperty("Bottom Length")
	private String bottomLength;

	@JsonProperty("Inseam (inches)")
	private String inseam;

	@JsonProperty("Activity")
	private String activity;

	@JsonProperty("Leg Type")
	private String legType;

	@JsonProperty("Pocket Type")
	private String pocketType;

	@JsonProperty("Pants Fly")
	private String pantsFly;

	@JsonProperty("materialCareDescription")
	private String materialCareDescription;

	@JsonProperty("Product Length (cm)")
	private String productLength;

	@JsonProperty("Occasion Type")
	private String occasionType;

	@JsonProperty("Weave Pattern")
	private String weavePattern;

	@JsonProperty("Type of Pleat")
	private String typeOfPleat;

	@JsonProperty("Waist Rise")
	private String waistRise;

	@JsonProperty("Style Keywords")
	private String styleKeywords;

	@JsonProperty("Shade [Fashion]")
	private String shade;

	@JsonProperty("Faded")
	private String faded;

	@JsonProperty("Material Type[Bottoms]")
	private String materialType;

	@JsonProperty("PantsLength")
	private String pantsLength;

	@JsonProperty("Style Name[Bottoms]")
	private String styleName;

	@JsonProperty("Measurements")
	private String measurements;

	@JsonProperty("Product Length (inches)")
	private String productLengthInches;

	@JsonProperty("Pattern Print Type")
	private String patternPrintType;

	@JsonProperty("Fabric Stretch Type")
	private String fabricStretchType;

	@JsonProperty("To Fit Waist ( Inches )")
	private String toFitWaist;

	@JsonProperty("Wash Type-Jeans")
	private String washTypeJeans;

	@JsonProperty("Product Height (cm)")
	private String productHeight;

	@JsonProperty("Brand Color")
	private String brandColor;

	@JsonProperty("Waist (Inches)")
	private String waist;

	@JsonProperty("Outer Material")
	private String outerMaterial;

	@JsonProperty("Package Content")
	private String packageContent;

	@JsonProperty("Denim Treatments")
	private String denimTreatments;

	@JsonProperty("Distressed")
	private String distressed;

	@JsonProperty("Wash Color")
	private String washColor;

	@JsonProperty("Lining [Fashion]")
	private String lining;

	@JsonProperty("Product Width (cm)")
	private String productWidth;

	@JsonProperty("Fit")
	private String fit;

	@JsonProperty("product_tax_code")
	private String productTaxCode;

	@JsonProperty("Product Features7")
	private String productFeatures7;

	@JsonProperty("Product Features6")
	private String productFeatures6;

	@JsonProperty("Product Features8")
	private String productFeatures8;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSleeveLengthInches() {
		return sleeveLengthInches;
	}

	public void setSleeveLengthInches(String sleeveLengthInches) {
		this.sleeveLengthInches = sleeveLengthInches;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getCareInstructions() {
		return careInstructions;
	}

	public void setCareInstructions(String careInstructions) {
		this.careInstructions = careInstructions;
	}

	public String getWarrantyType() {
		return warrantyType;
	}

	public void setWarrantyType(String warrantyType) {
		this.warrantyType = warrantyType;
	}

	public String getReturnPolicy() {
		return returnPolicy;
	}

	public void setReturnPolicy(String returnPolicy) {
		this.returnPolicy = returnPolicy;
	}

	public String getStyleColorCode() {
		return styleColorCode;
	}

	public void setStyleColorCode(String styleColorCode) {
		this.styleColorCode = styleColorCode;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getHood() {
		return hood;
	}

	public void setHood(String hood) {
		this.hood = hood;
	}

	public String getWarrantyDescription() {
		return warrantyDescription;
	}

	public void setWarrantyDescription(String warrantyDescription) {
		this.warrantyDescription = warrantyDescription;
	}

	public String getdHybridSize() {
		return dHybridSize;
	}

	public void setdHybridSize(String dHybridSize) {
		this.dHybridSize = dHybridSize;
	}

	public String getWarrantySummary() {
		return warrantySummary;
	}

	public void setWarrantySummary(String warrantySummary) {
		this.warrantySummary = warrantySummary;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public String getNumberOfPockets() {
		return numberOfPockets;
	}

	public void setNumberOfPockets(String numberOfPockets) {
		this.numberOfPockets = numberOfPockets;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getNeckTypeFashion() {
		return neckTypeFashion;
	}

	public void setNeckTypeFashion(String neckTypeFashion) {
		this.neckTypeFashion = neckTypeFashion;
	}

	public String getgSTPercentange() {
		return gSTPercentange;
	}

	public void setgSTPercentange(String gSTPercentange) {
		this.gSTPercentange = gSTPercentange;
	}

	public String getLeafCategoryDHybrid() {
		return leafCategoryDHybrid;
	}

	public void setLeafCategoryDHybrid(String leafCategoryDHybrid) {
		this.leafCategoryDHybrid = leafCategoryDHybrid;
	}

	public String getMaterialTypeFashion() {
		return materialTypeFashion;
	}

	public void setMaterialTypeFashion(String materialTypeFashion) {
		this.materialTypeFashion = materialTypeFashion;
	}

	public String getParentCategoryDHybrid() {
		return parentCategoryDHybrid;
	}

	public void setParentCategoryDHybrid(String parentCategoryDHybrid) {
		this.parentCategoryDHybrid = parentCategoryDHybrid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLengthFashion() {
		return lengthFashion;
	}

	public void setLengthFashion(String lengthFashion) {
		this.lengthFashion = lengthFashion;
	}

	public String getManufacturerPinCode() {
		return manufacturerPinCode;
	}

	public void setManufacturerPinCode(String manufacturerPinCode) {
		this.manufacturerPinCode = manufacturerPinCode;
	}

	public int getmRP() {
		return mRP;
	}

	public void setmRP(int mRP) {
		this.mRP = mRP;
	}

	public String getBustInches() {
		return bustInches;
	}

	public void setBustInches(String bustInches) {
		this.bustInches = bustInches;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public String getSearchKeywords() {
		return searchKeywords;
	}

	public void setSearchKeywords(String searchKeywords) {
		this.searchKeywords = searchKeywords;
	}

	public double getBaseCost() {
		return baseCost;
	}

	public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getImporterPinCode() {
		return importerPinCode;
	}

	public void setImporterPinCode(String importerPinCode) {
		this.importerPinCode = importerPinCode;
	}

	public String getStyleNameTops() {
		return styleNameTops;
	}

	public void setStyleNameTops(String styleNameTops) {
		this.styleNameTops = styleNameTops;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getImporterName() {
		return importerName;
	}

	public void setImporterName(String importerName) {
		this.importerName = importerName;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getPocket() {
		return pocket;
	}

	public void setPocket(String pocket) {
		this.pocket = pocket;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	public String getImage18() {
		return image18;
	}

	public void setImage18(String image18) {
		this.image18 = image18;
	}

	public String getImage19() {
		return image19;
	}

	public void setImage19(String image19) {
		this.image19 = image19;
	}

	public String getImage16() {
		return image16;
	}

	public void setImage16(String image16) {
		this.image16 = image16;
	}

	public String getImage17() {
		return image17;
	}

	public void setImage17(String image17) {
		this.image17 = image17;
	}

	public String getAcrossShoulderInches() {
		return acrossShoulderInches;
	}

	public void setAcrossShoulderInches(String acrossShoulderInches) {
		this.acrossShoulderInches = acrossShoulderInches;
	}

	public String getImage25() {
		return image25;
	}

	public void setImage25(String image25) {
		this.image25 = image25;
	}

	public String getBrandDescription() {
		return brandDescription;
	}

	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}

	public String getImage26() {
		return image26;
	}

	public void setImage26(String image26) {
		this.image26 = image26;
	}

	public String getImage23() {
		return image23;
	}

	public void setImage23(String image23) {
		this.image23 = image23;
	}

	public String getImage24() {
		return image24;
	}

	public void setImage24(String image24) {
		this.image24 = image24;
	}

	public String getImage21() {
		return image21;
	}

	public void setImage21(String image21) {
		this.image21 = image21;
	}

	public String getImage22() {
		return image22;
	}

	public void setImage22(String image22) {
		this.image22 = image22;
	}

	public String getImage20() {
		return image20;
	}

	public void setImage20(String image20) {
		this.image20 = image20;
	}

	public String gethSNCode() {
		return hSNCode;
	}

	public void sethSNCode(String hSNCode) {
		this.hSNCode = hSNCode;
	}

	public String getCollar() {
		return collar;
	}

	public void setCollar(String collar) {
		this.collar = collar;
	}

	public String getModifieddate() {
		return modifieddate;
	}

	public void setModifieddate(String modifieddate) {
		this.modifieddate = modifieddate;
	}

	public String getShippedInDays() {
		return shippedInDays;
	}

	public void setShippedInDays(String shippedInDays) {
		this.shippedInDays = shippedInDays;
	}

	public String getFabricComposition() {
		return fabricComposition;
	}

	public void setFabricComposition(String fabricComposition) {
		this.fabricComposition = fabricComposition;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFeatureJacket() {
		return featureJacket;
	}

	public void setFeatureJacket(String featureJacket) {
		this.featureJacket = featureJacket;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getImage14() {
		return image14;
	}

	public void setImage14(String image14) {
		this.image14 = image14;
	}

	public String getImage15() {
		return image15;
	}

	public void setImage15(String image15) {
		this.image15 = image15;
	}

	public String getImage12() {
		return image12;
	}

	public void setImage12(String image12) {
		this.image12 = image12;
	}

	public String getImage13() {
		return image13;
	}

	public void setImage13(String image13) {
		this.image13 = image13;
	}

	public String getImage10() {
		return image10;
	}

	public void setImage10(String image10) {
		this.image10 = image10;
	}

	public String getImage11() {
		return image11;
	}

	public void setImage11(String image11) {
		this.image11 = image11;
	}

	public String getSleeveTypeFashion() {
		return sleeveTypeFashion;
	}

	public void setSleeveTypeFashion(String sleeveTypeFashion) {
		this.sleeveTypeFashion = sleeveTypeFashion;
	}

	public String getFabricCare() {
		return fabricCare;
	}

	public void setFabricCare(String fabricCare) {
		this.fabricCare = fabricCare;
	}

	public int getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(int salePrice) {
		this.salePrice = salePrice;
	}

	public String getFitTops() {
		return fitTops;
	}

	public void setFitTops(String fitTops) {
		this.fitTops = fitTops;
	}

	public String getManufacturerAddress() {
		return manufacturerAddress;
	}

	public void setManufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress = manufacturerAddress;
	}

	public String getClosure() {
		return closure;
	}

	public void setClosure(String closure) {
		this.closure = closure;
	}

	public String getMultipackSet() {
		return multipackSet;
	}

	public void setMultipackSet(String multipackSet) {
		this.multipackSet = multipackSet;
	}

	public String getVariationTheme() {
		return variationTheme;
	}

	public void setVariationTheme(String variationTheme) {
		this.variationTheme = variationTheme;
	}

	public String getPackerNameAndAddressWithPincode() {
		return packerNameAndAddressWithPincode;
	}

	public void setPackerNameAndAddressWithPincode(String packerNameAndAddressWithPincode) {
		this.packerNameAndAddressWithPincode = packerNameAndAddressWithPincode;
	}

	public String getChestInches() {
		return chestInches;
	}

	public void setChestInches(String chestInches) {
		this.chestInches = chestInches;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getModelFit() {
		return modelFit;
	}

	public void setModelFit(String modelFit) {
		this.modelFit = modelFit;
	}

	public String getImage9() {
		return image9;
	}

	public void setImage9(String image9) {
		this.image9 = image9;
	}

	public String getImage8() {
		return image8;
	}

	public void setImage8(String image8) {
		this.image8 = image8;
	}

	public String getImage7() {
		return image7;
	}

	public void setImage7(String image7) {
		this.image7 = image7;
	}

	public String getImage6() {
		return image6;
	}

	public void setImage6(String image6) {
		this.image6 = image6;
	}

	public String getImporterAddress() {
		return importerAddress;
	}

	public void setImporterAddress(String importerAddress) {
		this.importerAddress = importerAddress;
	}

	public String getImage5() {
		return image5;
	}

	public void setImage5(String image5) {
		this.image5 = image5;
	}

	public String getImage4() {
		return image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getRootCategoryDHybrid() {
		return rootCategoryDHybrid;
	}

	public void setRootCategoryDHybrid(String rootCategoryDHybrid) {
		this.rootCategoryDHybrid = rootCategoryDHybrid;
	}

	public String getOuterMaterialTops() {
		return outerMaterialTops;
	}

	public void setOuterMaterialTops(String outerMaterialTops) {
		this.outerMaterialTops = outerMaterialTops;
	}

	public String getImage29() {
		return image29;
	}

	public void setImage29(String image29) {
		this.image29 = image29;
	}

	public String getImage27() {
		return image27;
	}

	public void setImage27(String image27) {
		this.image27 = image27;
	}

	public String getImage28() {
		return image28;
	}

	public void setImage28(String image28) {
		this.image28 = image28;
	}

	public String getProductFeatures3() {
		return productFeatures3;
	}

	public void setProductFeatures3(String productFeatures3) {
		this.productFeatures3 = productFeatures3;
	}

	public String getProductFeatures2() {
		return productFeatures2;
	}

	public void setProductFeatures2(String productFeatures2) {
		this.productFeatures2 = productFeatures2;
	}

	public String getProductFeatures5() {
		return productFeatures5;
	}

	public void setProductFeatures5(String productFeatures5) {
		this.productFeatures5 = productFeatures5;
	}

	public String getProductFeatures4() {
		return productFeatures4;
	}

	public void setProductFeatures4(String productFeatures4) {
		this.productFeatures4 = productFeatures4;
	}

	public String getImage30() {
		return image30;
	}

	public void setImage30(String image30) {
		this.image30 = image30;
	}

	public String getProductFeatures1() {
		return productFeatures1;
	}

	public void setProductFeatures1(String productFeatures1) {
		this.productFeatures1 = productFeatures1;
	}

	public String getsKUClassification() {
		return sKUClassification;
	}

	public void setsKUClassification(String sKUClassification) {
		this.sKUClassification = sKUClassification;
	}

	public String getSkuName() {
		return skuName;
	}

	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}

	public String getProductWeightGms() {
		return productWeightGms;
	}

	public void setProductWeightGms(String productWeightGms) {
		this.productWeightGms = productWeightGms;
	}

	public List<ProductSlug> getSlug() {
		return slug;
	}

	public void setSlug(List<ProductSlug> slug) {
		this.slug = slug;
	}

	public ProductLabel getLabel() {
		return label;
	}

	public void setLabel(ProductLabel label) {
		this.label = label;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getByLine() {
		return byLine;
	}

	public void setByLine(String byLine) {
		this.byLine = byLine;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getAboutTheBrand() {
		return aboutTheBrand;
	}

	public void setAboutTheBrand(String aboutTheBrand) {
		this.aboutTheBrand = aboutTheBrand;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public List<String> getKeyword() {
		return keyword;
	}

	public void setKeyword(List<String> keyword) {
		this.keyword = keyword;
	}

	public List<String> getMixedFile() {
		return mixedFile;
	}

	public void setMixedFile(List<String> mixedFile) {
		this.mixedFile = mixedFile;
	}

	public String getFile3d() {
		return file3d;
	}

	public void setFile3d(String file3d) {
		this.file3d = file3d;
	}

	public String getImageTransition() {
		return imageTransition;
	}

	public void setImageTransition(String imageTransition) {
		this.imageTransition = imageTransition;
	}

	public String getVideoTransition() {
		return videoTransition;
	}

	public void setVideoTransition(String videoTransition) {
		this.videoTransition = videoTransition;
	}

	public String getAdminTitle() {
		return adminTitle;
	}

	public void setAdminTitle(String adminTitle) {
		this.adminTitle = adminTitle;
	}

	public String getStyleSKUCode() {
		return styleSKUCode;
	}

	public void setStyleSKUCode(String styleSKUCode) {
		this.styleSKUCode = styleSKUCode;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getBottomLength() {
		return bottomLength;
	}

	public void setBottomLength(String bottomLength) {
		this.bottomLength = bottomLength;
	}

	public String getInseam() {
		return inseam;
	}

	public void setInseam(String inseam) {
		this.inseam = inseam;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getLegType() {
		return legType;
	}

	public void setLegType(String legType) {
		this.legType = legType;
	}

	public String getPocketType() {
		return pocketType;
	}

	public void setPocketType(String pocketType) {
		this.pocketType = pocketType;
	}

	public String getPantsFly() {
		return pantsFly;
	}

	public void setPantsFly(String pantsFly) {
		this.pantsFly = pantsFly;
	}

	public String getMaterialCareDescription() {
		return materialCareDescription;
	}

	public void setMaterialCareDescription(String materialCareDescription) {
		this.materialCareDescription = materialCareDescription;
	}

	public String getProductLength() {
		return productLength;
	}

	public void setProductLength(String productLength) {
		this.productLength = productLength;
	}

	public String getOccasionType() {
		return occasionType;
	}

	public void setOccasionType(String occasionType) {
		this.occasionType = occasionType;
	}

	public String getWeavePattern() {
		return weavePattern;
	}

	public void setWeavePattern(String weavePattern) {
		this.weavePattern = weavePattern;
	}

	public String getTypeOfPleat() {
		return typeOfPleat;
	}

	public void setTypeOfPleat(String typeOfPleat) {
		this.typeOfPleat = typeOfPleat;
	}

	public String getWaistRise() {
		return waistRise;
	}

	public void setWaistRise(String waistRise) {
		this.waistRise = waistRise;
	}

	public String getStyleKeywords() {
		return styleKeywords;
	}

	public void setStyleKeywords(String styleKeywords) {
		this.styleKeywords = styleKeywords;
	}

	public String getShade() {
		return shade;
	}

	public void setShade(String shade) {
		this.shade = shade;
	}

	public String getFaded() {
		return faded;
	}

	public void setFaded(String faded) {
		this.faded = faded;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}

	public String getPantsLength() {
		return pantsLength;
	}

	public void setPantsLength(String pantsLength) {
		this.pantsLength = pantsLength;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public String getMeasurements() {
		return measurements;
	}

	public void setMeasurements(String measurements) {
		this.measurements = measurements;
	}

	public String getProductLengthInches() {
		return productLengthInches;
	}

	public void setProductLengthInches(String productLengthInches) {
		this.productLengthInches = productLengthInches;
	}

	public String getPatternPrintType() {
		return patternPrintType;
	}

	public void setPatternPrintType(String patternPrintType) {
		this.patternPrintType = patternPrintType;
	}

	public String getFabricStretchType() {
		return fabricStretchType;
	}

	public void setFabricStretchType(String fabricStretchType) {
		this.fabricStretchType = fabricStretchType;
	}

	public String getToFitWaist() {
		return toFitWaist;
	}

	public void setToFitWaist(String toFitWaist) {
		this.toFitWaist = toFitWaist;
	}

	public String getWashTypeJeans() {
		return washTypeJeans;
	}

	public void setWashTypeJeans(String washTypeJeans) {
		this.washTypeJeans = washTypeJeans;
	}

	public String getProductHeight() {
		return productHeight;
	}

	public void setProductHeight(String productHeight) {
		this.productHeight = productHeight;
	}

	public String getBrandColor() {
		return brandColor;
	}

	public void setBrandColor(String brandColor) {
		this.brandColor = brandColor;
	}

	public String getWaist() {
		return waist;
	}

	public void setWaist(String waist) {
		this.waist = waist;
	}

	public String getOuterMaterial() {
		return outerMaterial;
	}

	public void setOuterMaterial(String outerMaterial) {
		this.outerMaterial = outerMaterial;
	}

	public String getPackageContent() {
		return packageContent;
	}

	public void setPackageContent(String packageContent) {
		this.packageContent = packageContent;
	}

	public String getDenimTreatments() {
		return denimTreatments;
	}

	public void setDenimTreatments(String denimTreatments) {
		this.denimTreatments = denimTreatments;
	}

	public String getDistressed() {
		return distressed;
	}

	public void setDistressed(String distressed) {
		this.distressed = distressed;
	}

	public String getWashColor() {
		return washColor;
	}

	public void setWashColor(String washColor) {
		this.washColor = washColor;
	}

	public String getLining() {
		return lining;
	}

	public void setLining(String lining) {
		this.lining = lining;
	}

	public String getProductWidth() {
		return productWidth;
	}

	public void setProductWidth(String productWidth) {
		this.productWidth = productWidth;
	}

	public String getFit() {
		return fit;
	}

	public void setFit(String fit) {
		this.fit = fit;
	}

	public String getProductTaxCode() {
		return productTaxCode;
	}

	public void setProductTaxCode(String productTaxCode) {
		this.productTaxCode = productTaxCode;
	}

	public String getProductFeatures7() {
		return productFeatures7;
	}

	public void setProductFeatures7(String productFeatures7) {
		this.productFeatures7 = productFeatures7;
	}

	public String getProductFeatures6() {
		return productFeatures6;
	}

	public void setProductFeatures6(String productFeatures6) {
		this.productFeatures6 = productFeatures6;
	}

	public String getProductFeatures8() {
		return productFeatures8;
	}

	public void setProductFeatures8(String productFeatures8) {
		this.productFeatures8 = productFeatures8;
	}

}
