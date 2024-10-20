package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class UserService {
	public List<User> getAllUsers() {
		return this.mockListUsers();
	}

	public User getUserById(Long id) {
		for (User user : this.mockListUsers()) {
			if (user.getId().equals(id)) {
				return user;
			}
		}

		return null;
	}

	public List<User> mockListUsers() {
		List<User> dummy = new ArrayList<User>();
		dummy.add(new User(1L, "Do Trong Nhan", "dtnhan@gmail.com"));
		dummy.add(new User(2L, "Nguyen Xuan Hung", "nxhung@gmail.com"));
		dummy.add(new User(3L, "Tran Tuan Kiet", "ttkiet@gmail.com"));
		dummy.add(new User(4L, "Ung Chan Vinh", "ucvinh@gmail.com"));
		dummy.add(new User(5L, "Nguyen Quang Huy", "nqhuy@gmail.com"));

		return dummy;
	}
}
