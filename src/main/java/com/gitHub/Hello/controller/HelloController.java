package com.gitHub.Hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
	
	@GetMapping("/hello/name")
	public String getHello(@PathVariable("name") String name) {
		return "Hello	" + name;
	}
	
}
