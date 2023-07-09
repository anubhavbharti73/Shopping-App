package com.example.users.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.users.model.UserModel;

@Service
public interface UserService {
	
	public UserModel saveUser(UserModel userModel);
	public UserModel getUserByEmail(String emailid);
	public UserModel findByEmailidAndPassword(String emailid,String password);
	public List<UserModel> getAllUser();
}
