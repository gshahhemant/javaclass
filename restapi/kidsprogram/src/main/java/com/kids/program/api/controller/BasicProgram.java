package com.kids.program.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/basic")
@RestController
public class BasicProgram {
	
	
	@GetMapping(value="/test")
	public String test() {
		
		return "hellow I am working";
	}

	@GetMapping(value="/add")
	public int addTwoNumbr(@RequestParam  int num1, @RequestParam  int num2) {
		
		return num1+num2;
	}

	
}
