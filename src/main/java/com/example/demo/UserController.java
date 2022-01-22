package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.User;
import com.example.demo.service.IUserService;

@RestController
public class UserController {
	@Autowired
	IUserService userService;
	
	@GetMapping("/user") // fetch records from server.
	Iterable<User> getUsers() {
		return userService.getUsers();
	}
	
	// To get a particular user by "id"
	@GetMapping("/user/{id}")
	Optional<User> getUsers(@PathVariable("id") Integer id) {
		return userService.getUser(id);
	}
	
	@PostMapping("/user") //creates records.
	void createUser(@RequestBody User user) {
		System.out.println(user.getName());
		userService.saveUser(user);
	}
	@DeleteMapping("/user")
	void deleteUser() {
		
	}
}
