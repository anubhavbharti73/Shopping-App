package com.example.shopitem.ShopItem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.shopitem.ShopItem.model.Item;

@Service
public interface ItemService {
	
	public Item saveItem(Item item);
	public List<Item> getAllItem();

}
