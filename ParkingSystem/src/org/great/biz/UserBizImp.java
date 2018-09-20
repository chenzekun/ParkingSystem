/**   
 * Copyright © 2018 传一科技.
 * 
 * @Package: org.great.biz 
 * @author: JX180301_赖麒峰(Ryan)   
 * @date: 2018年9月18日 上午11:17:42 
 */
package org.great.biz;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.great.entity.CarBean;
import org.great.entity.UserBean;
import org.great.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserBizImp
 * @Description: TODO
 * @author: JX180301_赖麒峰(Ryan)
 * @date: 2018年9月18日 上午11:17:42
 */
@Service
public class UserBizImp implements UserBiz {

	int i = 0;
	@Resource
	private UserMapper userMapper;

	private UserBean bean;

	// 1,前台登录
	@Override
	public UserBean userLogin(UserBean userBean) {
		userBean = userMapper.userLogin(userBean);
		return userBean;
	}

	// 2，前台注册
	@Override
	public int userRegister(UserBean userBean) {
		System.out.println("userBean" + userBean.getUserName());
		System.out.println("userBean" + userBean.getUserRegTime());
		i = userMapper.userRegister(userBean);
		return i;
	}

	// 3,车俩信息增加
	@Override
	public void vehicleIncrease(CarBean carbean) {
		userMapper.vehicleIncrease(carbean);

	}

	// 4,用户车辆关系增加
	@Override
	public void userVehicleRelationship(String userId) {
		userMapper.userVehicleRelationship(userId);

	}

	// 5，手机号查重
	public UserBean checkUser(String userTel) {
		System.out.println("手机查重");
		bean = userMapper.checkUser(userTel);		
		return bean;
	}

	// 6,用户车辆列表
	@Override
	public List<CarBean> userVehicle(String userId) {
		List<CarBean> list = new ArrayList<CarBean>();
		list = userMapper.userVehicle(userId);
		return list;
	}

	// 7,查userid
	@Override
	public UserBean userMaximum(String userTel) {
		bean = userMapper.userMaximum(userTel);
		return bean;
	}

}
