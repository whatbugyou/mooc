package com.mooc.service;

import com.mooc.entity.User;

public interface UserService {

	boolean login(User user);

	User enterPersonalCenter();

	int changeUser(User user);
	
}
