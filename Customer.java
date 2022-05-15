package com.spring.foobar.demo.models;


@ApiModel (Description ="Details about the customer")
public class Customer {

	
	@ApiModelProperty (notes= "unique customer number of customer")
	Integer CustomerNumber;
	@ApiModelProperty (notes= "unique customer name of customer")
	String CustomerName;
	@ApiModelProperty (notes= "unique customer phone of customer")
	String Phone;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(Integer customerNumber, String customerName, String phone) {
		super();
		CustomerNumber = customerNumber;
		CustomerName = customerName;
		Phone = phone;
	}

	public Integer getCustomerNumber() {
		return CustomerNumber;
	}

	public void setCustomerNumber(Integer customerNumber) {
		CustomerNumber = customerNumber;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [CustomerNumber=" + CustomerNumber + ", CustomerName=" + CustomerName + ", Phone=" + Phone
				+ "]";
	}
	


}

