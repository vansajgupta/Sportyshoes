package com.spring.foobar.demo.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.foobar.demo.models.Customer;
import com.spring.foobar.demo.repositories.CustomerRepository;

public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Boolean addCustomer(Integer customerNumber,String customerName,String phone) {
		
		Customer customer = new Customer(customerNumber, customerName, phone);
		try {
			return customerRepository.createCustomer(customer)>0;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
