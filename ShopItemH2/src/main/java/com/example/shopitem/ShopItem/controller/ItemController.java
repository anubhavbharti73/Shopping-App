package com.example.shopitem.ShopItem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shopitem.ShopItem.model.Item;
import com.example.shopitem.ShopItem.service.ItemService;

@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@PostMapping("/add")
	public ResponseEntity<Item> saveItem(@RequestBody Item item){
		return new ResponseEntity<Item>(itemService.saveItem(item),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Item>> getAllItem(){
		return new ResponseEntity<List<Item>>(itemService.getAllItem(),HttpStatus.OK);
	}
	
	@GetMapping("/see")
	public ResponseEntity<String> seeFunc() {
		return new ResponseEntity<String>("This is Item Class",HttpStatus.OK);
	}

}
