package com.demo.ResalePortal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.ResalePortal.entity.User;
import com.demo.ResalePortal.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public List<User> create(List<User> user) {
		// TODO Auto-generated method stub
		return userRepository.saveAll(user);
	}

	

	

}
