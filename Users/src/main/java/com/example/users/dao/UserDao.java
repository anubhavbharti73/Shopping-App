package com.example.users.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.users.model.UserModel;

@Repository
public interface UserDao extends JpaRepository<UserModel, String> {

	public UserModel findByEmailidAndPassword(String email,String password);

	
}
