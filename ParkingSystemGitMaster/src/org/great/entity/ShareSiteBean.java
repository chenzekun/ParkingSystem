package org.great.entity;

/**
 * 
 * @ClassName: ShareSiteBean 
 * @Description: 共享车位bean
 * @author: ShakaW(魏金毅)
 * @date: 2018年9月18日 下午3:33:15
 */
public class ShareSiteBean {

	private String shareId;//共享id
	private String carId;//发起者车牌id
	private String shareStartDate;//共享起始时间
	private String shareEndDate;//共享结束时间
	private String shareState;//共享状态
	private String carNum;//接收者车牌
	private String shareCost;//支付费用
	
	/**
	 * 
	 * @Title:ShareSiteBean
	 * @Description:共享车位bean空构造
	 */
	public ShareSiteBean() {
		
	}

	public String getShareId() {
		return shareId;
	}

	public void setShareId(String shareId) {
		this.shareId = shareId;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getShareStartDate() {
		return shareStartDate;
	}

	public void setShareStartDate(String shareStartDate) {
		this.shareStartDate = shareStartDate;
	}

	public String getShareEndDate() {
		return shareEndDate;
	}

	public void setShareEndDate(String shareEndDate) {
		this.shareEndDate = shareEndDate;
	}

	public String getShareState() {
		return shareState;
	}

	public void setShareState(String shareState) {
		this.shareState = shareState;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getShareCost() {
		return shareCost;
	}

	public void setShareCost(String shareCost) {
		this.shareCost = shareCost;
	}
	
	
}
