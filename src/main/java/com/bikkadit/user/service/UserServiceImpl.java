package com.bikkadit.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikkadit.user.exception.ResourceNotFoundException;
import com.bikkadit.user.model.User;
import com.bikkadit.user.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo ur;

	@Override
	public User saveUser(User user) {

		return ur.save(user);
	}

	@Override
	public List<User> getAllUser() {

		return ur.findAll();
	}

	@Override
	public User getUser(Long userId) {

		return ur.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !!"));
	}

}
