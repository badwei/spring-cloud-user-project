package com.bigbook.cloud.user.gateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bigbook.cloud.user.gateway.client.UserClient;
import com.bigbook.cloud.user.openapi.model.User;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/_userapi/")
@Slf4j
public class UserController {

	@Autowired
	UserClient userClient;

	@RequestMapping("/add")
	@ResponseBody
	public User add(User user) {
		log.debug("-----------------add user :{}",user);
		return this.userClient.add(user);
	}
	
	@GetMapping("/findById")
	public User findById(@RequestParam("id")Long id) {
		log.debug("----------------findById: {}",id);
		return this.userClient.findById(id);
	}
	
	@GetMapping("/index")
	public ModelAndView toIndex() {
		return new ModelAndView("index");
	}

}
