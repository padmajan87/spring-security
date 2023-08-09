package com.vinu.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

	@GetMapping("/myBalance")
	public String balanceDetails() {
		return "balance details";
	}
}
