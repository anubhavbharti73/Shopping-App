package com.example.shopitem.ShopItem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.shopitem.ShopItem.model.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, String> {

}
