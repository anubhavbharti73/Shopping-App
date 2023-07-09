package com.example.shopcart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.shopcart.model.Cart;

@Service
public interface CartService {
	
	public Cart saveItem(Cart cart);
	public List<Cart> findByEmailid(String emailid);
	public void deletethisItem(String itemId);

}
