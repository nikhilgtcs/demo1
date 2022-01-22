package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepository;
import com.example.demo.entity.User;

@Service
public class IUserService {
	@Autowired // Dependency Injection.
	UserRepository userRepository;
	
	@Transactional //this annotation is used when we don't want any data to get added to database if any Exception or Error is faced.
			//if we remove this annotation and try doing POST operation, then despite the error in line : 21 the data/record gets added to the database.
	public void saveUser(User user) {
		userRepository.save(user);
		//throw new IllegalArgumentException();
	}
	public Iterable<User> getUsers() {
		return userRepository.findAll();
	}
	public Optional<User> getUser(Integer id) {
		return userRepository.findById(id);
	}
	@Transactional
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
	
}
