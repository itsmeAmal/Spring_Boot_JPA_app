package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Item;
import com.example.demo.repository.itemRepositories;
import com.example.demo.service.itemService;

@Service
public class itemServiceImpl implements itemService{
	
	@Autowired
	private itemRepositories itemRepositories;

	@Override
	public List<Item> getAllItems() {
		List<Item> itemList = itemRepositories.findAll();
		return itemList;
	}

	@Override
	public Item addItem(Item item) {
		 Item itm =itemRepositories.save(item);
		return itm; 
	}

	@Override
	public Item updateItem(Item item) {
		Item itm = null;
		if(item.getId()  != 0) {
			 itm = itemRepositories.save(item);			
		}
		return itm;
	}

	@Override
	public Item deleteItem(int itemId) {
		itemRepositories.deleteById(itemId); 
		Item item = itemRepositories.getOne(itemId);
		return item;
	}

	@Override
	public Item getItemByItemId(int itemId) {
		Item item = itemRepositories.getOne(itemId);
		return item; 
	}

}
