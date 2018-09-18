package org.great.entity;
/**
 * 
 * @ClassName: BillBean 
 * @Description: TODO
 * @author: WangCaiHui(王财辉)Jack
 * @date: 2018年9月18日 下午3:02:53
 */

//账单记录表
public class BillBean {
public String	billId;//	账单ID
public String	carId;//车牌ID
public String	billType;//	收支类型
public String	billDate;//	账单时间

public BillBean() {
	
}

public BillBean(String billId, String carId, String billType, String billDate) {
	super();
	this.billId = billId;
	this.carId = carId;
	this.billType = billType;
	this.billDate = billDate;
}

public String getBillId() {
	return billId;
}

public void setBillId(String billId) {
	this.billId = billId;
}

public String getCarId() {
	return carId;
}

public void setCarId(String carId) {
	this.carId = carId;
}

public String getBillType() {
	return billType;
}

public void setBillType(String billType) {
	this.billType = billType;
}

public String getBillDate() {
	return billDate;
}

public void setBillDate(String billDate) {
	this.billDate = billDate;
}


}
