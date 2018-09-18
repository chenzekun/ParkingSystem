/**   
 * Copyright © 2018 传一科技.
 * 
 * @Package: org.great.entity 
 * @author: JX180301_赖麒峰(Ryan)   
 * @date: 2018年9月18日 下午2:55:42 
 */
package org.great.entity;

/**
 * @ClassName: ParkSiteBean
 * @Description: TODO
 * @author: JX180301_赖麒峰(Ryan)
 * @date: 2018年9月18日 下午2:55:42
 */
public class ParkSiteBean
{
	private String siteId; // 车位ID
	private String siteNum; // 车位编号
	private String areaId; // 车位区域ID
	private String floorId; // 楼层ID
	private String siteState; // 车位状态
	private double locationX; // 坐标x
	private double locationY; // 坐标y

	public ParkSiteBean()
	{

	}

	public String getSiteId()
	{
		return siteId;
	}

	public String getSiteNum()
	{
		return siteNum;
	}

	public String getAreaId()
	{
		return areaId;
	}

	public String getFloorId()
	{
		return floorId;
	}

	public String getSiteState()
	{
		return siteState;
	}

	public double getLocationX()
	{
		return locationX;
	}

	public double getLocationY()
	{
		return locationY;
	}

	public void setSiteId(String siteId)
	{
		this.siteId = siteId;
	}

	public void setSiteNum(String siteNum)
	{
		this.siteNum = siteNum;
	}

	public void setAreaId(String areaId)
	{
		this.areaId = areaId;
	}

	public void setFloorId(String floorId)
	{
		this.floorId = floorId;
	}

	public void setSiteState(String siteState)
	{
		this.siteState = siteState;
	}

	public void setLocationX(double locationX)
	{
		this.locationX = locationX;
	}

	public void setLocationY(double locationY)
	{
		this.locationY = locationY;
	}
}
