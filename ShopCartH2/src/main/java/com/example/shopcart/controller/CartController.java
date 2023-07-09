package com.example.shopcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopcart.model.Cart;
import com.example.shopcart.service.CartService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("cart")
public class CartController {
	
	@Autowired
	CartService cartService;
	
	@PostMapping("/saveitem")
	ResponseEntity<Cart> saveCartItem(@RequestBody Cart cart){
		return new ResponseEntity<Cart>(cartService.saveItem(cart), HttpStatus.OK); 
	}
	
	@GetMapping("/{emailid}")
	ResponseEntity<List<Cart>> getAllItem(@PathVariable String emailid){
		return new ResponseEntity<List<Cart>>(cartService.findByEmailid(emailid),HttpStatus.OK);
	}
	
	@DeleteMapping("/{itemId}")
	ResponseEntity deletetheItem(@PathVariable String itemId) {
		cartService.deletethisItem(itemId);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	

}
