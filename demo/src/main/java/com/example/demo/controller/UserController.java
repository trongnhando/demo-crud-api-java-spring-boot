package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@GetMapping
	public List<User> getAllUsers() {
		List<User> data = new ArrayList<User>();
		User row1 = new User();
		row1.setEmail("dtnhan@gmail.com");
		row1.setName("Do Trong Nhan");
		data.add(row1);
		return data;
	}
}
