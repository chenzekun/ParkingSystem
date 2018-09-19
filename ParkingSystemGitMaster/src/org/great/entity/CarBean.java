package org.great.entity;

/**
 * 
 * @ClassName: CarBean 
 * @Description: 车位信息Bean
 * @author: ShakaW(魏金毅)
 * @date: 2018年9月18日 下午3:25:44
 */
public class CarBean {

	private String carId;//车ID
	private String carPlate;//车牌
	private String carRole;//会员状态
	private String carStartDate;//会员办理时间
	private String carEndDate;//会员到期时间
	private String carParkState;//停车状态
	private String carVipSite;//VIP车位

	/**
	 * 
	 * @Title:CarBean
	 * @Description:车位信息Bean空构造
	 */
	public CarBean() {
		
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public String getCarRole() {
		return carRole;
	}

	public void setCarRole(String carRole) {
		this.carRole = carRole;
	}

	public String getCarStartDate() {
		return carStartDate;
	}

	public void setCarStartDate(String carStartDate) {
		this.carStartDate = carStartDate;
	}

	public String getCarEndDate() {
		return carEndDate;
	}

	public void setCarEndDate(String carEndDate) {
		this.carEndDate = carEndDate;
	}

	public String getCarParkState() {
		return carParkState;
	}

	public void setCarParkState(String carParkState) {
		this.carParkState = carParkState;
	}

	public String getCarVipSite() {
		return carVipSite;
	}

	public void setCarVipSite(String carVipSite) {
		this.carVipSite = carVipSite;
	}
	
	
}
