package com.helloworld.hellow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hellow")
public class HellowController {
	
	@GetMapping
	public String hellow() {
		return "Mentalidades ---> Persistência, muita pesistência!!!";

	}
}
