package com.bigbook.cloud.user.openapi.provider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bigbook.cloud.user.openapi.model.User;


@RequestMapping("/user/")
public interface UserProvider {

	@PostMapping("/add")
	public User add(User user);
	
	@GetMapping("/findById")
	public User findById(@RequestParam("id")Long id);

}
