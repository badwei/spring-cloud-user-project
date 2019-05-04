package com.bigbook.cloud.user.service.webapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bigbook.cloud.user.openapi.model.User;
import com.bigbook.cloud.user.openapi.provider.UserProvider;
import com.bigbook.cloud.user.service.spi.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class UserApiController implements UserProvider {
	
	@Autowired
	UserService userService;
	

	@Override
	public User add(User user) {
		log.info("------------------add user ------------> {}",user);
		return userService.add(user);
	}

	@Override
	public User findById(Long id) {
		log.info("------------------find user ------------> {}",id);
		return userService.findById(id);
	}

}
