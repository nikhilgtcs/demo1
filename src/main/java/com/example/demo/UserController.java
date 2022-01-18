package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.User;

@RestController
public class UserController {
	@GetMapping("/user")
	String getUser() {
		System.out.println("testing");
		return "Testing";
	}
	@PostMapping("/user")
	void createUser(@RequestBody User user) {
		System.out.println(user.getName());
	}
}
