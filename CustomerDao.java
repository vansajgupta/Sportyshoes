package com.spring.foobar.demo.daos;

import java.util.List;


import com.spring.foobar.demo.models.Customer;

public interface CustomerDao {

	//create operation
	Integer createCustomer(Customer customer);
	
	
	//read/retrive operation
	Customer findCustomerByCustomerNumber(Integer customernumber);
	List<Customer> findAllCustomers() ;
	
	//update operation
	Integer Customer(Customer customer) ;

	//delete operation
Integer deleteCustomerByCustomerNumber(Integer customerNumber) ;
	
}
