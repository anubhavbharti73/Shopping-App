package com.example.shopcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cart {
	
	String emailid;
	@Id
	String itemId;
	String itemName;
	float itemPrice;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}
	@Override
	public String toString() {
		return "Cart [emailid=" + emailid + ", itemId=" + itemId + ", itemName=" + itemName
				+ ", itemPrice=" + itemPrice + "]";
	}
	public Cart(String emailid, String itemId, String itemName, float itemPrice) {
		super();
		
		this.emailid = emailid;
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
