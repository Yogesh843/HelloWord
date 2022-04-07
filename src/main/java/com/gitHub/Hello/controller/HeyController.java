package com.gitHub.Hello.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeyController {
	
	@RequestMapping("/name")
	public String getHey(@PathVariable("name") String name) {
		return "Hey	" + name;
	}
	
	
}
