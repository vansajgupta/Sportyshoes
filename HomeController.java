package com.spring.foobar.demo.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {
	
	
	@GetMapping("/Home")
	public String inder() {
	return "Hello user Welcome to the sportyshoes";
	}
}
