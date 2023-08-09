package com.vinu.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

	@GetMapping("/myLoans")
	public String loanDetails() {
		return "Loan Details";
	}
}
