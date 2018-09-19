/**   
 * Copyright © 2018 传一科技.
 * 
 * @Package: org.great.entity 
 * @author: JX180301_赖麒峰(Ryan)   
 * @date: 2018年9月18日 下午3:04:26 
 */
package org.great.entity;

/**
 * @ClassName: ParkRecord
 * @Description: TODO
 * @author: JX180301_赖麒峰(Ryan)
 * @date: 2018年9月18日 下午3:04:26
 */
public class ParkRecordBean
{
	private String parkId; // 停车记录ID
	private String carId; // 车牌ID
	private String parkEnterDate; // 停车时间
	private String parkOutDate; // 出场时间
	private String siteId; // 车位
	private double parkCost; // 停车费用

	/**
	 * @Title:ParkRecordBean
	 * @Description:停车记录表,无参构造函数
	 */
	public ParkRecordBean()
	{

	}

	public String getParkId()
	{
		return parkId;
	}

	public String getCarId()
	{
		return carId;
	}

	public String getParkEnterDate()
	{
		return parkEnterDate;
	}

	public String getParkOutDate()
	{
		return parkOutDate;
	}

	public String getSiteId()
	{
		return siteId;
	}

	public double getParkCost()
	{
		return parkCost;
	}

	public void setParkId(String parkId)
	{
		this.parkId = parkId;
	}

	public void setCarId(String carId)
	{
		this.carId = carId;
	}

	public void setParkEnterDate(String parkEnterDate)
	{
		this.parkEnterDate = parkEnterDate;
	}

	public void setParkOutDate(String parkOutDate)
	{
		this.parkOutDate = parkOutDate;
	}

	public void setSiteId(String siteId)
	{
		this.siteId = siteId;
	}

	public void setParkCost(double parkCost)
	{
		this.parkCost = parkCost;
	}

}
