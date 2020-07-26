package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.itemServiceDao;

@RestController
public class itemRestController {
	
	@Autowired
	private itemServiceDao itemService;
	
	@PostMapping("/addItem")
	public Item addItem(Item item) {
		return	itemService.addItem(item);
	}
	
	@GetMapping("/getAllItems")
	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/item/{itemId}")
	public Item getItemByItemId(@PathVariable int itemId) {
		return itemService.getItemByItemId(itemId);
	}
	
	@PostMapping("/item/{itemId}")
	public Item deleteItem(@PathVariable int itemId) {
		return itemService.deleteItem(itemId);
	}	

}
