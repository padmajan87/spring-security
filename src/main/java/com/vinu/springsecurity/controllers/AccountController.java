package com.vinu.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/myAccount")
	public String accountDetails() {
		return "account details";
	}
}
