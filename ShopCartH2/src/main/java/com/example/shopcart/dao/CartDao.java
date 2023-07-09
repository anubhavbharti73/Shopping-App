package com.example.shopcart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shopcart.model.Cart;

@Repository
public interface CartDao extends JpaRepository<Cart,String>{
	
	public List<Cart> findByEmailid(String emailid);
	

}
