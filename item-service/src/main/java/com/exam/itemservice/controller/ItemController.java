package com.exam.itemservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.itemservice.model.Item;
import com.exam.itemservice.repo.ItemRepo;


@RestController
@RequestMapping("/items")
public class ItemController{
	
	private static final Logger LOGGER  = LoggerFactory.getLogger(ItemController.class);
	@Autowired
	private ItemRepo itemRepo;
	
	@PostMapping
	public Item add(@RequestBody Item item) {
		LOGGER.info("Item add: {}", item);
		return itemRepo.addItem(item);
	}
	
	@GetMapping
	public List<Item> findAll(){
		LOGGER.info("Item find");
		return itemRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Item findById(@PathVariable Long id) {
		LOGGER.info("Item find: id={}", id);
		return itemRepo.findById(id);
	}
	
	@GetMapping("/category/{categoryId}")
	public List<Item> findByCategory(@PathVariable("categoryId") Long categoryId){
		LOGGER.info("Item find: id={}", categoryId);
		return itemRepo.findByCategory(categoryId);
		
	}
	

}
