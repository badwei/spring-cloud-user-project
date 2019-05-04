package com.bigbook.cloud.user.gateway.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigbook.cloud.user.openapi.provider.UserProvider;

@FeignClient(value="user-service")
@RequestMapping("user-service")
public interface UserClient extends UserProvider{

}
