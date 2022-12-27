package com.persistent.internalproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistent.internalproject.entity.User;
import com.persistent.internalproject.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userDao;
	
	public User login(User user) {
		return userDao.findByEmailAndPassword(user.getEmail(), user.getPassword());
	}
	
	public User register(User user){
		User findedUser = userDao.findByEmail(user.getEmail());
		if(findedUser == null) {
			return userDao.save(user);
		}
		return null;
	}
}
