package com.spring.foobar.demo.home;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.foobar.demo.service.AuthService;


@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@Autowired
	private AuthService authService;
	

	
	@PostMapping("/signIn")
	public Map <String,String> signIn(@RequestBody MultiValueMap<String , String> credential){
		Map<String,String> signInResponse=new HashMap<>();
		
		Boolean userAuthenticated =authService.signInUser(credential.get("customernumber").get(0), credential.get("Phone").get(0));
		if(userAuthenticated) {
			signInResponse.put("status","true");
			signInResponse.put("messege","The user has been authenticated successfully");
		}
		else {
			signInResponse.put("status","true");
			signInResponse.put("messege","The user has been authenticated successfully");

		}
		return signInResponse;
	}
}
