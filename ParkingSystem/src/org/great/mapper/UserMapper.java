/**   
 * Copyright © 2018 传一科技.
 * 
 * @Package: org.great.mapper 
 * @author: JX180301_赖麒峰(Ryan)   
 * @date: 2018年9月18日 上午11:22:49 
 */
package org.great.mapper;
import java.util.List;

import org.great.entity.CarBean;
import org.great.entity.UserBean;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @author: JX180301_赖麒峰(Ryan)
 * @date: 2018年9月18日 上午11:22:49
 */
@Repository
public interface UserMapper {
	// 1，前台登录
	public UserBean userLogin(UserBean userBean);

	// 2，前台注册
	public int userRegister(UserBean userBean);

	// 3,车俩信息增加
	public void vehicleIncrease(CarBean carbean);

	// 4,用户车辆关系增加
	public void userVehicleRelationship(String userId);

	// 5，手机号查重
	public UserBean checkUser(String userTel);
	
	//6,用户车辆列表
	public List<CarBean>userVehicle(String userId);
	
	//7,用户最大值
	public UserBean userMaximum(String userTel);

}
