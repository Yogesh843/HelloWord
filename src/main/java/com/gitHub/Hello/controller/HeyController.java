package com.gitHub.Hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HeyController {
	
	@GetMapping("/hey/{name}")
	public String getHey(@PathVariable("name") String name) {
		return "Hey	" + name;
	}
	
	
}
