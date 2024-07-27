package com.bikkadit.user.service;

import java.util.List;

import com.bikkadit.user.model.User;

public interface UserService {

	User saveUser (User user);
	
	List<User> getAllUser();
	
	User getUser(Long userId);
}
