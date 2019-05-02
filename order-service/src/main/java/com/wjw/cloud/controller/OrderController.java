package com.wjw.cloud.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/order")
public class OrderController {

	@GetMapping(path = "active")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public String active() {
		return "Working";
	}
	
}
