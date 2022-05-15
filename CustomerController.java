package com.spring.foobar.demo.home;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.foobar.demo.service.AuthService;
import com.spring.foobar.demo.service.CustomerService;

@RestController
@RequestMapping("/api/auth")
public class CustomerController {


	
	@Autowired
	private CustomerService authService;
	
	
	
	
	
	@PostMapping("/signIn")
	public Map <String,String> signIn(@RequestBody MultiValueMap<String , String> newCustomerDetails){
		Map<String,String> signUpResponse=new HashMap<>();
		
		Boolean userRegistered =customerService.addcustomer(
				
		Integer.parseInt(	newCustomerDetails.get("customerNumber").get(0),)
			newCustomerDetails.get("customerName").get(0),
			newCustomerDetails.get("Phone").get(0));
		if(userRegistered) {
			signUpResponse.put("status","true");
			signUpResponse.put("messege","The user has been registered successfully");
		}
		else {
			signUpResponse.put("status","true");
			signUpResponse.put("messege","The user has been invalid info");

		}
		return signInResponse;
	}
}

}
