package com.bigbook.cloud.user.service.spi.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.bigbook.cloud.user.openapi.model.User;
import com.bigbook.cloud.user.service.spi.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User add(User user) {
		return new User(1003029320L, "add { hello world }", new Date());
	}

	@Override
	public User findById(Long id) {
		return new User(1003029320L, "get { hello world }", new Date());
	}

}
