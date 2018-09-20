package org.great.entity;

import org.springframework.stereotype.Component;

/**
 * 
 * @ClassName: SchTimeBean 
 * @Description: TODO
 * @author: WangCaiHui(王财辉)Jack
 * @date: 2018年9月18日 下午3:05:16
 */
@Component
//排班时段表
public class SchTimeBean {
private String	schId;//	排班ID
private String	schTime	;//排班时段


public SchTimeBean() {	
	
}


public SchTimeBean(String schId, String schTime) {
	super();
	this.schId = schId;
	this.schTime = schTime;
}


public String getSchId() {
	return schId;
}


public void setSchId(String schId) {
	this.schId = schId;
}


public String getSchTime() {
	return schTime;
}


public void setSchTime(String schTime) {
	this.schTime = schTime;
}

}
