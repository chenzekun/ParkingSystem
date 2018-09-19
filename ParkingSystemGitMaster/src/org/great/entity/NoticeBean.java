/**   
 * Copyright © 2018 传一科技.
 * 
 * @Package: org.great.entity 
 * @author: JX180301_赖麒峰(Ryan)   
 * @date: 2018年9月18日 下午3:54:02 
 */
package org.great.entity;

/** 
 * @ClassName: NoticeTbl 
 * @Description: 提示牌实体类
 * @author: JX180301_赖麒峰(Ryan)  
 * @date: 2018年9月18日 下午3:54:02  
 */
public class NoticeBean
{
	private String noticeId; //提示牌ID
	private String noticeNum; //提示牌编号
	private String noticeDirection; //提示牌方向
	private String noticeDomain; //提示区域
	private String noticeState; //提示牌状态
	
	public NoticeBean() {
		
	}

	public String getNoticeId()
	{
		return noticeId;
	}

	public String getNoticeNum()
	{
		return noticeNum;
	}

	public String getNoticeDirection()
	{
		return noticeDirection;
	}

	public String getNoticeDomain()
	{
		return noticeDomain;
	}

	public String getNoticeState()
	{
		return noticeState;
	}

	public void setNoticeId(String noticeId)
	{
		this.noticeId = noticeId;
	}

	public void setNoticeNum(String noticeNum)
	{
		this.noticeNum = noticeNum;
	}

	public void setNoticeDirection(String noticeDirection)
	{
		this.noticeDirection = noticeDirection;
	}

	public void setNoticeDomain(String noticeDomain)
	{
		this.noticeDomain = noticeDomain;
	}

	public void setNoticeState(String noticeState)
	{
		this.noticeState = noticeState;
	}
	
	
}
