//package com.example.users.controller;
//
//public class UserController {
//
//}

package com.example.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.model.UserAuth;
import com.example.users.model.UserModel;
import com.example.users.service.UserService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/reg")
	public ResponseEntity<UserModel> saveUser(@RequestBody UserModel user){
		return new ResponseEntity<UserModel>(userService.saveUser(user),HttpStatus.OK);
	}
	
	@GetMapping("/{email}")
	public ResponseEntity<UserModel> getUserById(@PathVariable String email){
		return new ResponseEntity<UserModel>(userService.getUserByEmail(email),HttpStatus.OK);
	}
	
	@GetMapping("/see")
	public String printingString() {
		return "This is User API-2.0";
	}
	
	@GetMapping
	public ResponseEntity<List<UserModel>> getAllUser(){
		return new ResponseEntity<List<UserModel>>(userService.getAllUser(),HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<UserModel> login(@RequestBody UserAuth userAuth){
		return new ResponseEntity<UserModel>(userService.findByEmailidAndPassword(userAuth.getEmailid(),userAuth.getPassword()),HttpStatus.OK);
	}
}
