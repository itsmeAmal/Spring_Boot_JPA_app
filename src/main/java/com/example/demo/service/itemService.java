package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Item;

public interface itemService {

	public List<Item> getAllItems();
	
	public Item addItem(Item item); 
	
	public Item updateItem(Item item);
	
	public Item deleteItem(int itemId);
	
	public Item getItemByItemId(int itemId);
	
}
