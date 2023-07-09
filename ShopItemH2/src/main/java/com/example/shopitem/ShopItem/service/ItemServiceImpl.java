package com.example.shopitem.ShopItem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shopitem.ShopItem.dao.ItemDao;
import com.example.shopitem.ShopItem.model.Item;

@Service
public class ItemServiceImpl implements ItemService{

	@Autowired
	ItemDao itemDao;
	
	@Override
	public Item saveItem(Item item) {
		return itemDao.save(item);
	}

	@Override
	public List<Item> getAllItem() {
		return (List<Item>) itemDao.findAll();
	}

}
