package com.dicksoy.provider.impl;

import com.dicksoy.api.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public String sayHello(String name) {
		return "hello : " + name;
	}

}
