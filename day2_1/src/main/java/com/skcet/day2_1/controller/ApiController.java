package com.skcet.day2_1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@Value("${studentName}")
	private String studentName;
	@GetMapping("09")
	private String getName()
	{
		return "Name is: "+studentName;
	}

}
