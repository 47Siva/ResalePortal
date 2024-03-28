package com.demo.ResalePortal.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ResalePortal.entity.User;
import com.demo.ResalePortal.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/adduser")
	public List<User> addUser (@RequestBody List<User> user){
		return userService.create(user);
	}

}
