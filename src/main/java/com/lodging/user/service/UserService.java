package com.lodging.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lodging.user.entity.User;
import com.lodging.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Optional<User> getUser(Long id)
	{
		return userRepository.findById(id);
	}
	
	public User saveUser(User user)
	{
		return userRepository.save(user);
	}
}
