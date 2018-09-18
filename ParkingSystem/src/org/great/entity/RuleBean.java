package org.great.entity;
/**
 * 
 * @ClassName: RuleBean 
 * @Description: TODO
 * @author: WangCaiHui(王财辉)Jack
 * @date: 2018年9月18日 下午3:09:12
 */

//规则表
public class RuleBean {
private String	ruleId;//	规则ID
private String	parkTime;//	停车时间
private Double	parkCost;//	每小时计费



public RuleBean() {
	
}


public RuleBean(String ruleId, String parkTime, Double parkCost) {
	super();
	this.ruleId = ruleId;
	this.parkTime = parkTime;
	this.parkCost = parkCost;
}


public String getRuleId() {
	return ruleId;
}


public void setRuleId(String ruleId) {
	this.ruleId = ruleId;
}


public String getParkTime() {
	return parkTime;
}


public void setParkTime(String parkTime) {
	this.parkTime = parkTime;
}


public Double getParkCost() {
	return parkCost;
}


public void setParkCost(Double parkCost) {
	this.parkCost = parkCost;
}

}
