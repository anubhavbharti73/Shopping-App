package com.example.users.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.users.dao.UserDao;
import com.example.users.model.UserModel;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	public UserModel saveUser(UserModel user) {
		return userDao.save(user);
	}

	
	public UserModel getUserByEmail(String email) {
		Optional<UserModel> optUser= userDao.findById(email);
		return optUser.get();
	}


	public UserModel findByEmailidAndPassword(String emailid, String password) {
		return userDao.findByEmailidAndPassword(emailid,password);
	}


	@Override
	public List<UserModel> getAllUser() {
		return (List<UserModel>) userDao.findAll();
	}
	
	
}
