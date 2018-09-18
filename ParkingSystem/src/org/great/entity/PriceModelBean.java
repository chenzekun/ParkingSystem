package org.great.entity;
/**
 * 
 * @ClassName: PriceModelBean 
 * @Description: TODO
 * @author: WangCaiHui(王财辉)Jack
 * @date: 2018年9月18日 下午2:56:20
 */

//套餐表
public class PriceModelBean {
private String priceId;//套餐ID
private String  priceDate;//套餐月份
private Double priceCount;//价格
private String  priceType;//套餐类型

public PriceModelBean() {
	
}

public PriceModelBean(String priceId, String priceDate, Double priceCount, String priceType) {
	super();
	this.priceId = priceId;
	this.priceDate = priceDate;
	this.priceCount = priceCount;
	this.priceType = priceType;
}

public String getPriceId() {
	return priceId;
}

public void setPriceId(String priceId) {
	this.priceId = priceId;
}

public String getPriceDate() {
	return priceDate;
}

public void setPriceDate(String priceDate) {
	this.priceDate = priceDate;
}

public Double getPriceCount() {
	return priceCount;
}

public void setPriceCount(Double priceCount) {
	this.priceCount = priceCount;
}

public String getPriceType() {
	return priceType;
}

public void setPriceType(String priceType) {
	this.priceType = priceType;
}




}
