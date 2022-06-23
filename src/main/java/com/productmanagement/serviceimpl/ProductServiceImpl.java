package com.productmanagement.serviceimpl;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.productmanagement.constant.ProductServiceConstants;
import com.productmanagement.constant.URLConstants;
import com.productmanagement.model.Product;
import com.productmanagement.model.ProductCategory;
import com.productmanagement.model.ProductLabel;
import com.productmanagement.model.ProductSlug;
import com.productmanagement.repository.ProductCategoryRepository;
import com.productmanagement.repository.ProductLabelRepository;
import com.productmanagement.repository.ProductRepository;
import com.productmanagement.repository.ProductSlugRepository;
import com.productmanagement.request.OrderProductsRequest;
import com.productmanagement.request.ProductAvailabilityRequest;
import com.productmanagement.request.ProductRequest;
import com.productmanagement.request.ProductRequestBody;
import com.productmanagement.request.ProductSearchRequest;
import com.productmanagement.request.ProductSyncRequest;
import com.productmanagement.response.ApplicationResponse;
import com.productmanagement.response.ProductApiResponse;
import com.productmanagement.response.ProductAvailabilityResponse;
import com.productmanagement.response.ProductResponse;
import com.productmanagement.response.ProductSearchResponse;
import com.productmanagement.response.ProductVinResponse;
import com.productmanagement.response.SkuList;
import com.productmanagement.service.ProductService;
import com.productmanagement.utils.APIUtils;
import com.productmanagement.utils.DateUtils;

@Service
public class ProductServiceImpl implements ProductService {
	private final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	ProductSlugRepository productSlugRepository;

	@Autowired
	ProductLabelRepository productLabelRepository;

	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@Autowired
	OrderServiceImpl orderServiceImpl;

	public ProductVinResponse syncProductsWithVinculum(ProductSyncRequest productSyncRequest, boolean isFromScheduler) {
		logger.debug("syncProductsWithVinculum method start in ProductServiceImpl Class");
		ProductVinResponse productVinResponse = new ProductVinResponse();
		String productJsonResponse;
		try {
			String requestBody = new ObjectMapper().writeValueAsString(productSyncRequest.getProductRequestBody());
			Map<String, String> paramMap = new HashMap();
			paramMap.put("ApiOwner", "user");
			paramMap.put("ApiKey", "597c174badb549e7a5e0c667dbc3c17a");
			paramMap.put("RequestBody", requestBody);

			productJsonResponse = orderServiceImpl.generateRequest(paramMap, URLConstants.PRODUCT_CUSTOM_FETCH_URL);
			productVinResponse = new ObjectMapper().readValue(productJsonResponse, ProductVinResponse.class);
			List<Product> productList = productVinResponse.getProducts();
			if (null != productList && !productList.isEmpty()) {
				for (int i = 0; i < productList.size(); i++) {
					String rootCategory = productList.get(i).getRootCategoryDHybrid();

					String rootCategoryId = "";

					// root Category add
					if (null != rootCategory && !rootCategory.isEmpty()) {
						ProductCategory rootCategoryDb = productCategoryRepository
								.getProductCategoryByName(rootCategory);
						if (null != rootCategoryDb) {
							rootCategoryId = rootCategoryDb.getId();
						} else {
							ProductCategory categoryObj = new ProductCategory();
							categoryObj.setCategoryName(rootCategory);
							categoryObj.setParentCategoryId("-1");
							categoryObj = productCategoryRepository.save(categoryObj);
							rootCategoryId = categoryObj.getId();
						}

						// parent Category add in database (parent Category means child of rootCategory)
						String parentCategory = productList.get(i).getParentCategoryDHybrid();
						String parentCategoryId = null;
						if (null != parentCategory) {
							ProductCategory parentCategoryDb = productCategoryRepository
									.getProductCategoryByNameAndParentId(parentCategory, rootCategoryId);

							if (null != parentCategoryDb) {
								parentCategoryId = parentCategoryDb.getId();
							} else {
								ProductCategory parentCategoryObj = new ProductCategory();
								parentCategoryObj.setCategoryName(parentCategory);
								parentCategoryObj.setParentCategoryId(rootCategoryId);
								parentCategoryObj = productCategoryRepository.save(parentCategoryObj);
								parentCategoryId = parentCategoryObj.getId();
							}
						}
						productList.get(i).setCategoryId(parentCategoryId);
					}

					// product Add in database
					Product product = createVinProductObject(productList.get(i));
					if (null != product && null != product.getSkuCode()) {
						String skucode = product.getSkuCode();
						Product productDb = productRepository.getProductByProductId(skucode);
						if (null == productDb) {
							productRepository.save(product);
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return productVinResponse;
	}

	private Product createVinProductObject(Product product) {
		Product productObj = new Product();
		productObj.setAboutTheBrand(product.getAboutTheBrand());
		productObj.setYear(product.getYear());
		productObj.setSleeveLengthInches(product.getSleeveLengthInches());
		productObj.setVendorName(product.getVendorName());
		productObj.setCareInstructions(product.getCareInstructions());
		productObj.setWarrantyType(product.getWarrantyType());
		productObj.setReturnPolicy(product.getReturnPolicy());
		productObj.setStyleColorCode(product.getStyleColorCode());
		productObj.setSeason(product.getSeason());
		productObj.setHood(product.getHood());
		productObj.setWarrantyDescription(product.getWarrantyDescription());
		productObj.setdHybridSize(product.getdHybridSize());
		productObj.setWarrantySummary(product.getWarrantySummary());
		productObj.setDisclaimer(product.getDisclaimer());
		productObj.setNumberOfPockets(product.getNumberOfPockets());
		productObj.setBarcode(product.getBarcode());
		productObj.setNeckTypeFashion(product.getNeckTypeFashion());
		productObj.setgSTPercentange(product.getgSTPercentange());
		productObj.setLeafCategoryDHybrid(product.getLeafCategoryDHybrid());
		productObj.setMaterialTypeFashion(product.getMaterialTypeFashion());
		productObj.setParentCategoryDHybrid(product.getParentCategoryDHybrid());
		productObj.setDescription(product.getDescription());
		productObj.setLengthFashion(product.getLengthFashion());
		productObj.setManufacturerPinCode(product.getManufacturerPinCode());
		productObj.setSkuCode(product.getSkuCode());
		productObj.setmRP(product.getmRP());
		productObj.setBustInches(product.getBustInches());
		productObj.setWidth(product.getWidth());
		productObj.setPattern(product.getPattern());
		productObj.setSearchKeywords(product.getSearchKeywords());
		productObj.setBaseCost(product.getBaseCost());
		productObj.setManufacturerName(product.getManufacturerName());
		productObj.setImporterPinCode(product.getAboutTheBrand());
		productObj.setStyleNameTops(product.getStyleNameTops());
		productObj.setCreatedDate(product.getCreatedDate());
		productObj.setImporterName(product.getImporterName());
		productObj.setLength(product.getLength());
		productObj.setPocket(product.getPocket());
		productObj.setCountryOfOrigin(product.getCountryOfOrigin());
		productObj.setImage18(product.getImage18());
		productObj.setAcrossShoulderInches(product.getAcrossShoulderInches());
		productObj.setImage19(product.getImage19());
		productObj.setImage16(product.getImage16());
		productObj.setImage17(product.getImage17());
		productObj.setRootCategoryDHybrid(product.getRootCategoryDHybrid());
		productObj.setImage25(product.getImage25());
		productObj.setBrandDescription(product.getBrandDescription());
		productObj.setImage26(product.getImage26());
		productObj.setImage23(product.getImage23());
		productObj.setImage24(product.getImage24());
		productObj.setImage21(product.getImage21());
		productObj.setImage22(product.getImage22());
		productObj.setImage20(product.getImage20());
		productObj.sethSNCode(product.gethSNCode());
		productObj.setCollar(product.getCollar());
		productObj.setModifieddate(product.getModifieddate());
		productObj.setShippedInDays(product.getShippedInDays());
		productObj.setFabricComposition(product.getFabricComposition());
		productObj.setColor(product.getColor());
		productObj.setFeatureJacket(product.getFeatureJacket());
		productObj.setWeight(product.getWeight());
		productObj.setBrand(product.getBrand());
		productObj.setImage14(product.getImage14());
		productObj.setImage15(product.getImage15());
		productObj.setImage12(product.getImage12());
		productObj.setImage13(product.getImage13());
		productObj.setImage10(product.getImage10());
		productObj.setImage11(product.getImage11());
		productObj.setSleeveTypeFashion(product.getSleeveTypeFashion());
		productObj.setFabricCare(product.getFabricCare());
		productObj.setSalePrice(product.getSalePrice());
		productObj.setFitTops(product.getFitTops());
		productObj.setManufacturerAddress(product.getManufacturerAddress());
		productObj.setClosure(product.getClosure());
		productObj.setMultipackSet(product.getMultipackSet());
		productObj.setVariationTheme(product.getVariationTheme());
		productObj.setPackerNameAndAddressWithPincode(product.getPackerNameAndAddressWithPincode());
		productObj.setChestInches(product.getChestInches());
		productObj.setHeight(product.getHeight());
		productObj.setModelFit(product.getModelFit());
		productObj.setImage9(product.getImage9());
		productObj.setImage8(product.getImage8());
		productObj.setImage7(product.getImage7());
		productObj.setImage6(product.getImage6());
		productObj.setImporterAddress(product.getImporterAddress());
		productObj.setImage5(product.getImage5());
		productObj.setImage4(product.getImage4());
		productObj.setImage3(product.getImage3());
		productObj.setImage2(product.getImage2());
		productObj.setImage1(product.getImage1());
		productObj.setOuterMaterialTops(product.getOuterMaterialTops());
		productObj.setImage29(product.getImage29());
		productObj.setImage27(product.getImage27());
		productObj.setImage28(product.getImage28());
		productObj.setProductFeatures3(product.getProductFeatures3());
		productObj.setProductFeatures2(product.getProductFeatures2());
		productObj.setProductFeatures5(product.getProductFeatures5());
		productObj.setProductFeatures4(product.getProductFeatures4());
		productObj.setImage30(product.getImage30());
		productObj.setProductFeatures1(product.getProductFeatures1());
		productObj.setsKUClassification(product.getsKUClassification());
		productObj.setSkuName(product.getSkuName());
		productObj.setProductWeightGms(product.getProductWeightGms());
		productObj.setStyleSKUCode(product.getStyleSKUCode());
		productObj.setBottomLength(product.getBottomLength());
		productObj.setInseam(product.getInseam());
		productObj.setActivity(product.getActivity());
		productObj.setLegType(product.getLegType());
		productObj.setPocketType(product.getPocketType());
		productObj.setPantsFly(product.getPantsFly());
		productObj.setMaterialCareDescription(product.getMaterialCareDescription());
		productObj.setProductLength(product.getProductLength());
		productObj.setOccasionType(product.getOccasionType());
		productObj.setWeavePattern(product.getWeavePattern());
		productObj.setTypeOfPleat(product.getTypeOfPleat());
		productObj.setWaistRise(product.getWaistRise());
		productObj.setStyleKeywords(product.getStyleKeywords());
		productObj.setShade(product.getShade());
		productObj.setFaded(product.getFaded());
		productObj.setMaterialType(product.getMaterialType());
		productObj.setPantsLength(product.getPantsLength());
		productObj.setStyleName(product.getStyleName());
		productObj.setMeasurements(product.getMeasurements());
		productObj.setProductLengthInches(product.getProductLengthInches());
		productObj.setPatternPrintType(product.getPatternPrintType());
		productObj.setFabricStretchType(product.getFabricStretchType());
		productObj.setToFitWaist(product.getToFitWaist());
		productObj.setWashTypeJeans(product.getWashTypeJeans());
		productObj.setProductHeight(product.getProductHeight());
		productObj.setBrandColor(product.getBrandColor());
		productObj.setWaist(product.getWaist());
		productObj.setOuterMaterial(product.getOuterMaterial());
		productObj.setPackageContent(product.getPackageContent());
		productObj.setDenimTreatments(product.getDenimTreatments());
		productObj.setDistressed(product.getDistressed());
		productObj.setWashColor(product.getWashColor());
		productObj.setLining(product.getLining());
		productObj.setProductWidth(product.getProductWidth());
		productObj.setFit(product.getFit());
		productObj.setProductTaxCode(product.getProductTaxCode());
		productObj.setProductFeatures7(product.getProductFeatures7());
		productObj.setProductFeatures6(product.getProductFeatures6());
		productObj.setProductFeatures8(product.getProductFeatures8());
		productObj.setCategoryId(product.getCategoryId());
		return productObj;
	}


	private List<SkuList> getSkuList(List<ProductResponse> productResponseList) {
		logger.debug("getSkuList method Start in ProductServiceImpl Class");
		List<SkuList> skuList = new ArrayList<>();
		for (int i = 0; i < productResponseList.size(); i++) {
			if (null != productResponseList.get(i) && null != productResponseList.get(i).getSkuList()) {
				for (int j = 0; j < productResponseList.get(i).getSkuList().size(); j++) {
					skuList.add(productResponseList.get(i).getSkuList().get(j));
				}
			}
		}
		logger.debug("getSkuList method End in ProductServiceImpl Class");
		return skuList;
	}



	private void saveProduct(List<Product> productList) {
		productRepository.saveAll(productList);
	}

	private ProductSyncRequest getProductRequest(int pageNumber) {
		ProductSyncRequest productRequest = new ProductSyncRequest();
		ProductRequestBody productRequestBody = new ProductRequestBody();
		DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern(ProductServiceConstants.DATE_TIME_FORMAT);
		LocalDate fromDate = LocalDate.parse(getLastProductUpdatedDate(), inputFormat);
		DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern(ProductServiceConstants.DATE_FORMAT);
		productRequestBody.setPageSize(ProductServiceConstants.PAGE_SIZE);
		productRequestBody.setPageNumber(Integer.toString(pageNumber));
		productRequestBody.setDisplaySkuList(new ArrayList<>());
		productRequestBody.setFromDate(fromDate.format(outputFormat));
		productRequestBody.setToDate(fromDate.plusDays(1).format(outputFormat));
		productRequest.setApiKey(ProductServiceConstants.PRODUCT_API_KEY);
		productRequest.setApiOwner(ProductServiceConstants.PRODUCT_API_OWNER);
		productRequest.setProductRequestBody(productRequestBody);
		return productRequest;
	}

	@Override
	public ProductSearchResponse getProducts(ProductSearchRequest productSearchRequest) {
		logger.debug("getProducts method Start in ProductServiceImpl Class");
		if (productSearchRequest.getPageNumber() != 0 && productSearchRequest.getNumberOfRecord() != 0) {
			productSearchRequest.setPageNumber(productSearchRequest.getPageNumber() - 1);
		} else if (productSearchRequest.getPageNumber() != 0) {
			productSearchRequest.setNumberOfRecord(ProductServiceConstants.NUMBER_OF_RECORD);
		} else if (productSearchRequest.getNumberOfRecord() != 0) {
			productSearchRequest.setPageNumber(Integer.parseInt(ProductServiceConstants.PAGE_NUMBER) - 1);
		} else {
			productSearchRequest.setNumberOfRecord(ProductServiceConstants.NUMBER_OF_RECORD);
			productSearchRequest.setPageNumber(Integer.parseInt(ProductServiceConstants.PAGE_NUMBER) - 1);
		}
		Pageable paging = getPaging(productSearchRequest);
		ProductSearchResponse productSearchResponse = getProductList(productSearchRequest, paging);
		logger.debug("getProducts method end in ProductServiceImpl Class");
		return productSearchResponse;
	}

	private ProductSearchResponse getProductList(ProductSearchRequest productSearchRequest, Pageable paging) {
		logger.debug("getProductList method Start in ProductServiceImpl Class");
		Page<Product> pagedResult = null;
		ProductSearchResponse productSearchResponse = new ProductSearchResponse();
		if (null != productSearchRequest.getSearchParam()) {
			pagedResult = productRepository.getProductListBySearchParam(productSearchRequest.getSearchParam(), paging);
		} else if (null != productSearchRequest.getAvailability()) {
			pagedResult = productRepository.getProductListByAvailability(productSearchRequest.getAvailability(),
					paging);
		} else if (null != productSearchRequest.getColor()) {
			pagedResult = productRepository.getProductListByColor(productSearchRequest.getColor(), paging);
		} else if (null != productSearchRequest.getBrandName()) {
			pagedResult = productRepository.getProductListByBrandName(productSearchRequest.getBrandName(), paging);
		} else if ((productSearchRequest.getPriceStart() > 0) && (productSearchRequest.getPriceEnd() > 0)) {
			pagedResult = productRepository.getProductListByPriceRange(productSearchRequest.getPriceStart(),
					productSearchRequest.getPriceEnd(), paging);
		} else if (null != productSearchRequest.getSlugId()) {
			pagedResult = productRepository.getProductListBySlug(productSearchRequest.getSlugId(), paging);
		} else if (null != productSearchRequest.getProductId()) {
			pagedResult = productRepository.getProductListByProductId(productSearchRequest.getProductId(), paging);
		} else {
			pagedResult = productRepository.findAll(paging);
		}
		productSearchResponse.setCount(pagedResult.getTotalElements());
		setProductResponseList(productSearchResponse, pagedResult.toList());
		logger.debug("getProductList method end in ProductServiceImpl Class");
		return productSearchResponse;
	}

	private void setProductResponseList(ProductSearchResponse productSearchResponse, List<Product> productList) {
		if (!productList.isEmpty()) {
			List<ProductApiResponse> productApiResponseList = getProductApiResponseList(productList);
			productSearchResponse.setProductApiResponseList(productApiResponseList);
		}

	}

	private Pageable getPaging(ProductSearchRequest productSearchRequest) {
		logger.debug("getPaging method Start in ProductServiceImpl Class");
		Pageable paging = null;
		if (null != productSearchRequest.getSortColumnName() && null != productSearchRequest.getSortOrder()) {
			if (productSearchRequest.getSortOrder().equalsIgnoreCase(ProductServiceConstants.SORT_ORDER_DESC)) {
				paging = PageRequest.of(productSearchRequest.getPageNumber(), productSearchRequest.getNumberOfRecord(),
						Sort.Direction.DESC, productSearchRequest.getSortColumnName());
			} else {
				paging = PageRequest.of(productSearchRequest.getPageNumber(), productSearchRequest.getNumberOfRecord(),
						Sort.by(productSearchRequest.getSortColumnName()));
			}

		} else if (null != productSearchRequest.getSortColumnName()) {
			paging = PageRequest.of(productSearchRequest.getPageNumber(), productSearchRequest.getNumberOfRecord(),
					Sort.by(productSearchRequest.getSortColumnName()));
		} else {
			paging = PageRequest.of(productSearchRequest.getPageNumber(), productSearchRequest.getNumberOfRecord());
		}
		logger.debug("getPaging method end in ProductServiceImpl Class");
		return paging;
	}

	@Override
	public String getLastProductUpdatedDate() {
		Pageable paging = PageRequest.of(0, 1, Sort.Direction.DESC, "updateDate");
		List<Product> lastInsertedProduct = productRepository.getLastProductUpdatedDate(paging);
		if (lastInsertedProduct != null && !lastInsertedProduct.isEmpty()) {
			return lastInsertedProduct.get(0).getModifieddate();
		} else {
			return DateUtils.dateTimeFormat();
		}
	}

	private ProductResponse executePost(ProductSyncRequest productRequest) {
		logger.debug("executePost method start in ProductServiceImpl Class");
		ProductResponse productResponse = null;
		try {
			String result = APIUtils.doPost(productRequest);
			productResponse = new ObjectMapper().readValue(result, ProductResponse.class);
		} catch (IOException e) {
			logger.debug("Error while executing executePost" + e.getMessage());
		}
		logger.debug("executePost method end in ProductServiceImpl Class");
		return productResponse;
	}

	@Override
	public ApplicationResponse updateProducts(ProductRequest productRequest) {
		ApplicationResponse applicationResponse = new ApplicationResponse();
		logger.debug("updateProducts method end in ProductServiceImpl Class");
		List<String> productIds = productRequest.getProductId();
		try {
			if (null != productIds && productIds.size() > 0) {
				for (String productId : productIds) {

					if (null != productId) {
						Optional<Product> isProduct = productRepository.findById(productId);
						Product product = null;
						if (isProduct.isPresent()) {
							product = isProduct.get();
							if (null != productRequest.getSlug() && !productRequest.getSlug().isEmpty()) {
								List<ProductSlug> productRequestSlugList = productRequest.getSlug();
								List<ProductSlug> existingSlugList = product.getSlug();
								Set<ProductSlug> slugList = new HashSet<>();
								slugList.addAll(productRequestSlugList);
								if (null != existingSlugList && !existingSlugList.isEmpty()) {
									slugList.addAll(existingSlugList);
								}
								List<ProductSlug> updatedSlugList = new ArrayList<>(slugList);
								product.setSlug(updatedSlugList);

							}

							if (null != productRequest.getLabel()) {
								if ((productRequest.getLabel().getLabelName() != null
										&& !productRequest.getLabel().getLabelName().isEmpty())) {
									Optional<ProductLabel> isProductLabel = productLabelRepository
											.findByLabelName(productRequest.getLabel().getLabelName());
									if (isProductLabel.isPresent()) {
										product.setLabel(isProductLabel.get());

									}
								}
							}
							// product.setLabel(productRequest.getLabel());
							product.setIntro(productRequest.getIntro());
							product.setByLine(productRequest.getByLine());
							product.setDesc(productRequest.getDesc());
							product.setAboutTheBrand(productRequest.getAboutTheBrand());
							product.setServiceCode(productRequest.getServiceCode());
							product.setKeyword(productRequest.getKeyword());
							product.setMixedFile(productRequest.getMixedFile());
							product.setFile3d(productRequest.getFile3d());
							product.setImageTransition(productRequest.getImageTransition());
							product.setVideoTransition(productRequest.getVideoTransition());
							product.setAdminTitle(productRequest.getAdminTitle());
							productRepository.save(product);
						}
					}
					logger.debug("updateProducts method end in ProductServiceImpl Class");
				}
			}

			applicationResponse.setCode(HttpStatus.SC_OK);
			applicationResponse.setMessage("Updated successfully");
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return applicationResponse;
	}

	@Override
	public List<Product> getProductsByCategory(String productCategoryId, String pageNumber) {
		logger.debug("getProductsByCategory method end in ProductServiceImpl Class");
		ProductSearchRequest productSearchRequest = new ProductSearchRequest();
		productSearchRequest.setNumberOfRecord(ProductServiceConstants.NUMBER_OF_RECORD);
		productSearchRequest.setPageNumber(Integer.parseInt(pageNumber) - 1);
		Pageable paging = getPaging(productSearchRequest);
		List<Product> products = productRepository.getProductsByCategory(productCategoryId, paging);
		logger.debug("getProductsByCategory method end in ProductServiceImpl Class");
		return products;
	}

	@Override
	public List<Product> getProductsBySlug(String slugId, String pageNumber) {
		logger.debug("getProductsBySlug method end in ProductServiceImpl Class");
		ProductSearchRequest productSearchRequest = new ProductSearchRequest();
		productSearchRequest.setNumberOfRecord(ProductServiceConstants.NUMBER_OF_RECORD);
		productSearchRequest.setPageNumber(Integer.parseInt(pageNumber) - 1);
		Pageable paging = getPaging(productSearchRequest);
		List<Product> products = productRepository.getProductsBySlug(slugId, paging);
		logger.debug("getProductsBySlug method end in ProductServiceImpl Class");
		return products;
	}

	@Override
	public ProductApiResponse getProductByProductId(String productId) {
		Product product = productRepository.getProductByProductId(productId);
		List<Product> productList = new ArrayList();
		productList.add(product);
		List<ProductApiResponse> productApiResponseList = getProductApiResponseList(productList);
		return productApiResponseList.get(0);
	}

	private List<ProductApiResponse> getProductApiResponseList(List<Product> productList) {
		List<ProductApiResponse> productApiResponseList = new ArrayList();
		for (int i = 0; i < productList.size(); i++) {
			Product product = productList.get(i);
			ProductApiResponse productApiResponse = new ProductApiResponse();
			productApiResponse.setId(product.getId());
			productApiResponse.setAboutTheBrand(product.getAboutTheBrand());
			productApiResponse.setYear(product.getYear());
			productApiResponse.setSleeveLengthInches(product.getSleeveLengthInches());
			productApiResponse.setVendorName(product.getVendorName());
			productApiResponse.setCareInstructions(product.getCareInstructions());
			productApiResponse.setWarrantyType(product.getWarrantyType());
			productApiResponse.setReturnPolicy(product.getReturnPolicy());
			productApiResponse.setStyleColorCode(product.getStyleColorCode());
			productApiResponse.setSeason(product.getSeason());
			productApiResponse.setHood(product.getHood());
			productApiResponse.setWarrantyDescription(product.getWarrantyDescription());
			productApiResponse.setdHybridSize(product.getdHybridSize());
			productApiResponse.setWarrantySummary(product.getWarrantySummary());
			productApiResponse.setDisclaimer(product.getDisclaimer());
			productApiResponse.setNumberOfPockets(product.getNumberOfPockets());
			productApiResponse.setBarcode(product.getBarcode());
			productApiResponse.setNeckTypeFashion(product.getNeckTypeFashion());
			productApiResponse.setgSTPercentange(product.getgSTPercentange());
			productApiResponse.setLeafCategoryDHybrid(product.getLeafCategoryDHybrid());
			productApiResponse.setMaterialTypeFashion(product.getMaterialTypeFashion());
			productApiResponse.setParentCategoryDHybrid(product.getParentCategoryDHybrid());
			productApiResponse.setDescription(product.getDescription());
			productApiResponse.setLengthFashion(product.getLengthFashion());
			productApiResponse.setManufacturerPinCode(product.getManufacturerPinCode());
			productApiResponse.setSkuCode(product.getSkuCode());
			productApiResponse.setmRP(product.getmRP());
			productApiResponse.setBustInches(product.getBustInches());
			productApiResponse.setWidth(product.getWidth());
			productApiResponse.setPattern(product.getPattern());
			productApiResponse.setSearchKeywords(product.getSearchKeywords());
			productApiResponse.setBaseCost(product.getBaseCost());
			productApiResponse.setManufacturerName(product.getManufacturerName());
			productApiResponse.setImporterPinCode(product.getAboutTheBrand());
			productApiResponse.setStyleNameTops(product.getStyleNameTops());
			productApiResponse.setCreatedDate(product.getCreatedDate());
			productApiResponse.setImporterName(product.getImporterName());
			productApiResponse.setLength(product.getLength());
			productApiResponse.setPocket(product.getPocket());
			productApiResponse.setCountryOfOrigin(product.getCountryOfOrigin());
			productApiResponse.setImage18(product.getImage18());
			productApiResponse.setAcrossShoulderInches(product.getAcrossShoulderInches());
			productApiResponse.setImage19(product.getImage19());
			productApiResponse.setImage16(product.getImage16());
			productApiResponse.setImage17(product.getImage17());
			productApiResponse.setRootCategoryDHybrid(product.getRootCategoryDHybrid());
			productApiResponse.setImage25(product.getImage25());
			productApiResponse.setBrandDescription(product.getBrandDescription());
			productApiResponse.setImage26(product.getImage26());
			productApiResponse.setImage23(product.getImage23());
			productApiResponse.setImage24(product.getImage24());
			productApiResponse.setImage21(product.getImage21());
			productApiResponse.setImage22(product.getImage22());
			productApiResponse.setImage20(product.getImage20());
			productApiResponse.sethSNCode(product.gethSNCode());
			productApiResponse.setCollar(product.getCollar());
			productApiResponse.setModifieddate(product.getModifieddate());
			productApiResponse.setShippedInDays(product.getShippedInDays());
			productApiResponse.setFabricComposition(product.getFabricComposition());
			productApiResponse.setColor(product.getColor());
			productApiResponse.setFeatureJacket(product.getFeatureJacket());
			productApiResponse.setWeight(product.getWeight());
			productApiResponse.setBrand(product.getBrand());
			productApiResponse.setImage14(product.getImage14());
			productApiResponse.setImage15(product.getImage15());
			productApiResponse.setImage12(product.getImage12());
			productApiResponse.setImage13(product.getImage13());
			productApiResponse.setImage10(product.getImage10());
			productApiResponse.setImage11(product.getImage11());
			productApiResponse.setSleeveTypeFashion(product.getSleeveTypeFashion());
			productApiResponse.setFabricCare(product.getFabricCare());
			productApiResponse.setSalePrice(product.getSalePrice());
			productApiResponse.setFitTops(product.getFitTops());
			productApiResponse.setManufacturerAddress(product.getManufacturerAddress());
			productApiResponse.setClosure(product.getClosure());
			productApiResponse.setMultipackSet(product.getMultipackSet());
			productApiResponse.setVariationTheme(product.getVariationTheme());
			productApiResponse.setPackerNameAndAddressWithPincode(product.getPackerNameAndAddressWithPincode());
			productApiResponse.setChestInches(product.getChestInches());
			productApiResponse.setHeight(product.getHeight());
			productApiResponse.setModelFit(product.getModelFit());
			productApiResponse.setImage9(product.getImage9());
			productApiResponse.setImage8(product.getImage8());
			productApiResponse.setImage7(product.getImage7());
			productApiResponse.setImage6(product.getImage6());
			productApiResponse.setImporterAddress(product.getImporterAddress());
			productApiResponse.setImage5(product.getImage5());
			productApiResponse.setImage4(product.getImage4());
			productApiResponse.setImage3(product.getImage3());
			productApiResponse.setImage2(product.getImage2());
			productApiResponse.setImage1(product.getImage1());
			productApiResponse.setOuterMaterialTops(product.getOuterMaterialTops());
			productApiResponse.setImage29(product.getImage29());
			productApiResponse.setImage27(product.getImage27());
			productApiResponse.setImage28(product.getImage28());
			productApiResponse.setProductFeatures3(product.getProductFeatures3());
			productApiResponse.setProductFeatures2(product.getProductFeatures2());
			productApiResponse.setProductFeatures5(product.getProductFeatures5());
			productApiResponse.setProductFeatures4(product.getProductFeatures4());
			productApiResponse.setImage30(product.getImage30());
			productApiResponse.setProductFeatures1(product.getProductFeatures1());
			productApiResponse.setsKUClassification(product.getsKUClassification());
			productApiResponse.setSkuName(product.getSkuName());
			productApiResponse.setProductWeightGms(product.getProductWeightGms());
			productApiResponse.setStyleSKUCode(product.getStyleSKUCode());
			productApiResponse.setBottomLength(product.getBottomLength());
			productApiResponse.setInseam(product.getInseam());
			productApiResponse.setActivity(product.getActivity());
			productApiResponse.setLegType(product.getLegType());
			productApiResponse.setPocketType(product.getPocketType());
			productApiResponse.setPantsFly(product.getPantsFly());
			productApiResponse.setMaterialCareDescription(product.getMaterialCareDescription());
			productApiResponse.setProductLength(product.getProductLength());
			productApiResponse.setOccasionType(product.getOccasionType());
			productApiResponse.setWeavePattern(product.getWeavePattern());
			productApiResponse.setTypeOfPleat(product.getTypeOfPleat());
			productApiResponse.setWaistRise(product.getWaistRise());
			productApiResponse.setStyleKeywords(product.getStyleKeywords());
			productApiResponse.setShade(product.getShade());
			productApiResponse.setFaded(product.getFaded());
			productApiResponse.setMaterialType(product.getMaterialType());
			productApiResponse.setPantsLength(product.getPantsLength());
			productApiResponse.setStyleName(product.getStyleName());
			productApiResponse.setMeasurements(product.getMeasurements());
			productApiResponse.setProductLengthInches(product.getProductLengthInches());
			productApiResponse.setPatternPrintType(product.getPatternPrintType());
			productApiResponse.setFabricStretchType(product.getFabricStretchType());
			productApiResponse.setToFitWaist(product.getToFitWaist());
			productApiResponse.setWashTypeJeans(product.getWashTypeJeans());
			productApiResponse.setProductHeight(product.getProductHeight());
			productApiResponse.setBrandColor(product.getBrandColor());
			productApiResponse.setWaist(product.getWaist());
			productApiResponse.setOuterMaterial(product.getOuterMaterial());
			productApiResponse.setPackageContent(product.getPackageContent());
			productApiResponse.setDenimTreatments(product.getDenimTreatments());
			productApiResponse.setDistressed(product.getDistressed());
			productApiResponse.setWashColor(product.getWashColor());
			productApiResponse.setLining(product.getLining());
			productApiResponse.setProductWidth(product.getProductWidth());
			productApiResponse.setFit(product.getFit());
			productApiResponse.setProductTaxCode(product.getProductTaxCode());
			productApiResponse.setProductFeatures7(product.getProductFeatures7());
			productApiResponse.setProductFeatures6(product.getProductFeatures6());
			productApiResponse.setProductFeatures8(product.getProductFeatures8());
			productApiResponse.setSlug(product.getSlug());
			productApiResponse.setLabel(product.getLabel());
			productApiResponse.setIntro(product.getIntro());
			productApiResponse.setAdminTitle(product.getAdminTitle());
			productApiResponse.setImageTransition(product.getImageTransition());
			productApiResponse.setVideoTransition(product.getVideoTransition());
			productApiResponse.setAboutTheBrand(product.getAboutTheBrand());
			productApiResponse.setByLine(product.getByLine());
			productApiResponse.setDesc(product.getDesc());
			productApiResponse.setServiceCode(product.getServiceCode());
			productApiResponse.setKeyword(product.getKeyword());
			productApiResponse.setMixedFile(product.getMixedFile());
			productApiResponse.setFile3d(product.getFile3d());
			productApiResponse.setCategoryId(product.getCategoryId());
			productApiResponse.setLabel(product.getLabel());
			productApiResponseList.add(productApiResponse);
		}
		return productApiResponseList;
	}

	@Override
	public ProductAvailabilityResponse checkAvailability(ProductAvailabilityRequest productAvailabilityRequest) {
		return APIUtils.doGet(productAvailabilityRequest);
	}

	@Override
	public Page<Product> getProductList(String name, Pageable paging) {
		Page<Product> productList;
		if (name == null || name.isEmpty())
			productList = productRepository.findAll(paging);
		else
			productList = productRepository.getProductListBySearchParam(name, paging);

		return productList;
	}

	@Override
	public List<Product> getOrderProducts(OrderProductsRequest orderProductRequest) {
		List<String> skuCodesList = orderProductRequest.getProductIds();
		String skuCodes[] = skuCodesList.toArray(new String[skuCodesList.size()]);
		return productRepository.findBy(skuCodes);
	}

}
