package com.example.demo.controllers;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class FirstController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
	
	@GetMapping("/accept")
	@ResponseStatus(HttpStatus.ACCEPTED)  // 202
	public String greet() {
		return "You have accepted the request!";
	}
	
	@GetMapping("/redirect")
	@ResponseStatus(HttpStatus.MOVED_PERMANENTLY)	// 301
	public String redirect() {
		return "Redirecting...";
	}
	
	@GetMapping("/delete")
	@ResponseStatus(HttpStatus.NO_CONTENT)	// 204
	public String delete() {
		return "Deleted successfully!";
	}
}
