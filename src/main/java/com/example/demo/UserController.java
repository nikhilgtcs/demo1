package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;

@RestController
public class UserController {
	IUserService userService;
	@GetMapping("/user")
	String getUser() {
		System.out.println("testing");
		return "Testing";
	}
	@PostMapping("/user")
	void createUser(@RequestBody User user) {
		System.out.println(user.getName());
		userService.saveUser(user);
	}
	@DeleteMapping("/user")
	void deleteUser() {
		// sdkjhd
//		jdbhewbw
	}
}
