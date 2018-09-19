/**   
 * Copyright © 2018 传一科技.
 * 
 * @Package: org.great.entity 
 * @author: JX180301_赖麒峰(Ryan)   
 * @date: 2018年9月18日 下午4:13:45 
 */
package org.great.entity;

/** 
 * @ClassName: TouchMachineBean 
 * @Description: TODO
 * @author: JX180301_赖麒峰(Ryan)  
 * @date: 2018年9月18日 下午4:13:45  
 */
public class TouchMachineBean
{
	private String touchId; //触控设备ID
	private String touchNum; //触控设备编号
	private String locationX; //触控设备x坐标
	private String locationY; //触控设备y坐标
	private String touchState; //设备状态
	
	public TouchMachineBean() {
		
	}

	public String getTouchId()
	{
		return touchId;
	}

	public String getTouchNum()
	{
		return touchNum;
	}

	public String getLocationX()
	{
		return locationX;
	}

	public String getLocationY()
	{
		return locationY;
	}

	public String getTouchState()
	{
		return touchState;
	}

	public void setTouchId(String touchId)
	{
		this.touchId = touchId;
	}

	public void setTouchNum(String touchNum)
	{
		this.touchNum = touchNum;
	}

	public void setLocationX(String locationX)
	{
		this.locationX = locationX;
	}

	public void setLocationY(String locationY)
	{
		this.locationY = locationY;
	}

	public void setTouchState(String touchState)
	{
		this.touchState = touchState;
	}
	
}
