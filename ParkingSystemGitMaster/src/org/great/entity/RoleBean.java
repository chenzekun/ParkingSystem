package org.great.entity;
/**
 * 
 * @ClassName: RoleBean 
 * @Description: TODO
 * @author: XingZheKun(陈泽坤)
 * @date: 2018年9月18日 下午3:31:14
 */

//角色表
public class RoleBean {
	
	private String roleId;   //角色ID
	private String roleName; //角色名称
	
	public RoleBean() {
		// TODO Auto-generated constructor stub
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
