package com.eclature.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
	
	@ResponseBody
	@GetMapping("/")
	public String helloWorld() {
		return "hello world...!";
	}

}
