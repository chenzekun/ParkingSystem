/**   
 * Copyright © 2018 传一科技.
 * 
 * @Package: org.great.test 
 * @author: JX180301_赖麒峰(Ryan)   
 * @date: 2018年9月18日 上午11:23:29 
 */
package org.great.test;

import javax.annotation.Resource;

import org.great.biz.UserBiz;
import org.great.entity.UserBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @ClassName: UserTest
 * @Description: TODO
 * @author: JX180301_赖麒峰(Ryan)
 * @date: 2018年9月18日 上午11:23:29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class UserTest {
	@Resource
	private UserBiz userBizImp;

	@Resource
	private UserBean userBean;
	
	@Resource
	private UserBean bean;

//	@Test
//	public void userLogin() {
//		userBean.setUserTel("15280463453");
//		userBean.setUserPwd("123456");
//		userBean = userBizImp.userLogin(userBean);
//		if (userBean != null) {
//			System.out.println("登录成功");
//		}
//	}

	@Test
	public void userRegister() {
		/*userBean.setUserId("22");*/
		userBean.setUserPwd("123456");
		userBean.setUserName("老张");
		userBean.setUserSex("男");
		userBean.setUserHead("img");
		userBean.setUserTel("15280463454");
		userBean.setUserEmail("1098349601@.qq.com");
		userBean.setUserIDCard("350524199609026032");
		userBean.setUserState("18");
		int i = userBizImp.userRegister(userBean);// 注册
		if (i > 0) {
			String usertel=userBean.getUserTel();
			bean = userBizImp.userMaximum(usertel);	
			if(bean !=null) {
				String userid = bean.getUserId();
				userBizImp.userVehicleRelationship(userid);
			}
			
		}	
	}
	@Test
	public void userMaximum() {

		bean = userBizImp.userMaximum("15280463453");
	}

}
