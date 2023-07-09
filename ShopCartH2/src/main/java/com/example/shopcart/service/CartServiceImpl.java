package com.example.shopcart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopcart.dao.CartDao;
import com.example.shopcart.model.Cart;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDao cartDao;
	
	public Cart saveItem(Cart cart) {
		return cartDao.save(cart);
	}

	@Override
	public List<Cart> findByEmailid(String emailid) {
		return cartDao.findByEmailid(emailid);
	}
	
	public void deletethisItem(String itemId) {
		cartDao.deleteById(itemId);
	}

	
	
}
