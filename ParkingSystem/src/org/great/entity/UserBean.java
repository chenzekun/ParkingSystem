package org.great.entity;

import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: UserBean 
 * @Description: TODO
 * @author: WangCaiHui(王财辉)Jack
 * @date: 2018年9月18日 下午2:48:47
 */
//用户Bean
@Component
public class UserBean {
	private String userId;// 用户ID
	private String userPwd;// 密码
	private String userName;// 姓名
	private String userSex;// 性别
	private String userHead;// 头像
	private String userTel;// 手机号
	private String userEmail;// Email
	private String userIDCard;// 身份证
	private String userState;// 用户状态
	private String userRegTime;// 注册时间

	public UserBean() {

	}

	public UserBean(String userId, String userPwd, String userName, String userSex, String userHead, String userTel,
			String userEmail, String userIDCard, String userState, String userRegTime) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userSex = userSex;
		this.userHead = userHead;
		this.userTel = userTel;
		this.userEmail = userEmail;
		this.userIDCard = userIDCard;
		this.userState = userState;
		this.userRegTime = userRegTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserHead() {
		return userHead;
	}

	public void setUserHead(String userHead) {
		this.userHead = userHead;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserIDCard() {
		return userIDCard;
	}

	public void setUserIDCard(String userIDCard) {
		this.userIDCard = userIDCard;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserRegTime() {
		return userRegTime;
	}

	public void setUserRegTime(String userRegTime) {
		this.userRegTime = userRegTime;
	}

}
