package com.bikkadit.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadit.user.model.User;
import com.bikkadit.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService us;
	
	@PostMapping("/")
	public ResponseEntity<User> creatUser(@RequestBody User user) {
		
		User saveUser = us.saveUser(user);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(saveUser);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable Long userId) {
		
		User user = us.getUser(userId);
		
		return ResponseEntity.ok(user);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<List<User>> getAllUser() {
		
		List<User> allUser = us.getAllUser();
		return ResponseEntity.ok(allUser);
		
	}
}
