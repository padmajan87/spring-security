package com.vinu.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

	@GetMapping("/contact")
	public String saveContactInquiry() {
		return "Contact Inquiry Details";
	}
}
