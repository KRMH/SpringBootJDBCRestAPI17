package com.tutorial.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MolMain {
	private Long id;
	
	private Long articleId;
	
	private Long siteId;
	
	private String masterProductCode;
	
	private Long orderId;
	
	//private String description_1;
	
	private Long plannedQuantity;
	
	private Long initialPlannedQuantity;
	
	private Long plannedValue;
	
	private Long initialPlannedValue;
	
	//private Timestamp planned_Availability_Date;
	
	//private Long min_Order_Quantity;
	
	private Long stockQuantity;
	
	private Long safetyStock;
	
	//private Long max_Maximum_Stock;
	
	private String categoryFamily;
	
	private Long initialSupplierId;
	
	private String supplierCode;
	
	private String supplierName1;
	
	private String supplierVariant;
	
	private String supplierVariantCodeDesc;
	
	//private String product_Group;
	
	//private String product_Group_Facing;
	
	private String abcCategory;
	
	private Long salesPrice;
	
	//private String category_Full_Name;
	
	//private Long calcPrice;
	
	private int isValidated;
	
	private int isManualOrder;
	
	private int isorderToday;
	
	private int isNextDoor;
	
	private int isActive;
	
	private int isBlocked;
	
	private Long roundingQty;
	
	private String plannedAvaDateIw;
	
	private String plannedAvaDateMM;
	
	private String plannedAvaDateYYYY;
	
	private Long supplierId;
	
	//private String category_Level_Name;
	
	private String masterProductCodeDesc;
	
	private String articleHierarchy;
	
	private String siteCode;
	
	private Long avgQty;
	
	private Long realQty;
	
	private Long fcstQty;
	
	private String replenishmentUser;
	
	private String orderStatus;
	
	private String supplierVariantName;
	
	//private Long outbound_Sold_Quantity;
	
	private String outboundUnsoldQtyList;
	
	private Long outboundSoldValue;
	
	private String outboundUnsoldValList;
	
	private String siteCodeName;
	
	private String xyzClass;
	
	private String alertName;
	
	private String alertIcon;
	
	private Long alertCount;
	
	private String sparkline;
	
	private Timestamp blockStartDate;
	
	private Timestamp blockEndDate;
	
	private Long alertSuspId;
	
	private String alertSuspIcon;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public Long getSiteId() {
		return siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	public String getMasterProductCode() {
		return masterProductCode;
	}

	public void setMasterProductCode(String masterProductCode) {
		this.masterProductCode = masterProductCode;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getPlannedQuantity() {
		return plannedQuantity;
	}

	public void setPlannedQuantity(Long plannedQuantity) {
		this.plannedQuantity = plannedQuantity;
	}

	public Long getInitialPlannedQuantity() {
		return initialPlannedQuantity;
	}

	public void setInitialPlannedQuantity(Long initialPlannedQuantity) {
		this.initialPlannedQuantity = initialPlannedQuantity;
	}

	public Long getPlannedValue() {
		return plannedValue;
	}

	public void setPlannedValue(Long plannedValue) {
		this.plannedValue = plannedValue;
	}

	public Long getInitialPlannedValue() {
		return initialPlannedValue;
	}

	public void setInitialPlannedValue(Long initialPlannedValue) {
		this.initialPlannedValue = initialPlannedValue;
	}

	public Long getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Long stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Long getSafetyStock() {
		return safetyStock;
	}

	public void setSafetyStock(Long safetyStock) {
		this.safetyStock = safetyStock;
	}

	public String getCategoryFamily() {
		return categoryFamily;
	}

	public void setCategoryFamily(String categoryFamily) {
		this.categoryFamily = categoryFamily;
	}

	public Long getInitialSupplierId() {
		return initialSupplierId;
	}

	public void setInitialSupplierId(Long initialSupplierId) {
		this.initialSupplierId = initialSupplierId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierName1() {
		return supplierName1;
	}

	public void setSupplierName1(String supplierName1) {
		this.supplierName1 = supplierName1;
	}

	public String getSupplierVariant() {
		return supplierVariant;
	}

	public void setSupplierVariant(String supplierVariant) {
		this.supplierVariant = supplierVariant;
	}

	public String getSupplierVariantCodeDesc() {
		return supplierVariantCodeDesc;
	}

	public void setSupplierVariantCodeDesc(String supplierVariantCodeDesc) {
		this.supplierVariantCodeDesc = supplierVariantCodeDesc;
	}

	public String getAbcCategory() {
		return abcCategory;
	}

	public void setAbcCategory(String abcCategory) {
		this.abcCategory = abcCategory;
	}

	public Long getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Long salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getIsValidated() {
		return isValidated;
	}

	public void setIsValidated(int isValidated) {
		this.isValidated = isValidated;
	}

	public int getIsManualOrder() {
		return isManualOrder;
	}

	public void setIsManualOrder(int isManualOrder) {
		this.isManualOrder = isManualOrder;
	}

	public int getIsorderToday() {
		return isorderToday;
	}

	public void setIsorderToday(int isorderToday) {
		this.isorderToday = isorderToday;
	}

	public int getIsNextDoor() {
		return isNextDoor;
	}

	public void setIsNextDoor(int isNextDoor) {
		this.isNextDoor = isNextDoor;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsBlocked() {
		return isBlocked;
	}

	public void setIsBlocked(int isBlocked) {
		this.isBlocked = isBlocked;
	}

	public Long getRoundingQty() {
		return roundingQty;
	}

	public void setRoundingQty(Long roundingQty) {
		this.roundingQty = roundingQty;
	}

	public String getPlannedAvaDateIw() {
		return plannedAvaDateIw;
	}

	public void setPlannedAvaDateIw(String plannedAvaDateIw) {
		this.plannedAvaDateIw = plannedAvaDateIw;
	}

	public String getPlannedAvaDateMM() {
		return plannedAvaDateMM;
	}

	public void setPlannedAvaDateMM(String plannedAvaDateMM) {
		this.plannedAvaDateMM = plannedAvaDateMM;
	}

	public String getPlannedAvaDateYYYY() {
		return plannedAvaDateYYYY;
	}

	public void setPlannedAvaDateYYYY(String plannedAvaDateYYYY) {
		this.plannedAvaDateYYYY = plannedAvaDateYYYY;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getMasterProductCodeDesc() {
		return masterProductCodeDesc;
	}

	public void setMasterProductCodeDesc(String masterProductCodeDesc) {
		this.masterProductCodeDesc = masterProductCodeDesc;
	}

	public String getArticleHierarchy() {
		return articleHierarchy;
	}

	public void setArticleHierarchy(String articleHierarchy) {
		this.articleHierarchy = articleHierarchy;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public Long getAvgQty() {
		return avgQty;
	}

	public void setAvgQty(Long avgQty) {
		this.avgQty = avgQty;
	}

	public Long getRealQty() {
		return realQty;
	}

	public void setRealQty(Long realQty) {
		this.realQty = realQty;
	}

	public Long getFcstQty() {
		return fcstQty;
	}

	public void setFcstQty(Long fcstQty) {
		this.fcstQty = fcstQty;
	}

	public String getReplenishmentUser() {
		return replenishmentUser;
	}

	public void setReplenishmentUser(String replenishmentUser) {
		this.replenishmentUser = replenishmentUser;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getSupplierVariantName() {
		return supplierVariantName;
	}

	public void setSupplierVariantName(String supplierVariantName) {
		this.supplierVariantName = supplierVariantName;
	}

	public String getOutboundUnsoldQtyList() {
		return outboundUnsoldQtyList;
	}

	public void setOutboundUnsoldQtyList(String outboundUnsoldQtyList) {
		this.outboundUnsoldQtyList = outboundUnsoldQtyList;
	}

	public Long getOutboundSoldValue() {
		return outboundSoldValue;
	}

	public void setOutboundSoldValue(Long outboundSoldValue) {
		this.outboundSoldValue = outboundSoldValue;
	}

	public String getOutboundUnsoldValList() {
		return outboundUnsoldValList;
	}

	public void setOutboundUnsoldValList(String outboundUnsoldValList) {
		this.outboundUnsoldValList = outboundUnsoldValList;
	}

	public String getSiteCodeName() {
		return siteCodeName;
	}

	public void setSiteCodeName(String siteCodeName) {
		this.siteCodeName = siteCodeName;
	}

	public String getXyzClass() {
		return xyzClass;
	}

	public void setXyzClass(String xyzClass) {
		this.xyzClass = xyzClass;
	}

	public String getAlertName() {
		return alertName;
	}

	public void setAlertName(String alertName) {
		this.alertName = alertName;
	}

	public String getAlertIcon() {
		return alertIcon;
	}

	public void setAlertIcon(String alertIcon) {
		this.alertIcon = alertIcon;
	}

	public Long getAlertCount() {
		return alertCount;
	}

	public void setAlertCount(Long alertCount) {
		this.alertCount = alertCount;
	}

	public String getSparkline() {
		return sparkline;
	}

	public void setSparkline(String sparkline) {
		this.sparkline = sparkline;
	}

	public Timestamp getBlockStartDate() {
		return blockStartDate;
	}

	public void setBlockStartDate(Timestamp blockStartDate) {
		this.blockStartDate = blockStartDate;
	}

	public Timestamp getBlockEndDate() {
		return blockEndDate;
	}

	public void setBlockEndDate(Timestamp blockEndDate) {
		this.blockEndDate = blockEndDate;
	}

	public Long getAlertSuspId() {
		return alertSuspId;
	}

	public void setAlertSuspId(Long alertSuspId) {
		this.alertSuspId = alertSuspId;
	}

	public String getAlertSuspIcon() {
		return alertSuspIcon;
	}

	public void setAlertSuspIcon(String alertSuspIcon) {
		this.alertSuspIcon = alertSuspIcon;
	}
}
