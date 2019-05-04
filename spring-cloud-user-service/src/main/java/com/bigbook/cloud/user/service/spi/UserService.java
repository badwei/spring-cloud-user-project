package com.bigbook.cloud.user.service.spi;

import com.bigbook.cloud.user.openapi.model.User;

public interface UserService {

	User add(User user);
	
	User findById(Long id);
}
