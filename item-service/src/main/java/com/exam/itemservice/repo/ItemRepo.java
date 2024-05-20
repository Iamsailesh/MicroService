package com.exam.itemservice.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.exam.itemservice.model.Item;

@Repository
public class ItemRepo {
	private List<Item> items = new ArrayList<>();

	public Item addItem(Item item) {
		items.add(item);
		return item;
	}

	public Item findById(Long id) {
		return items.stream().filter(item -> Long.valueOf(item.id()).equals(id)).findFirst().orElseThrow();

	}

	public List<Item> findAll() {
		return items;
	}
	public List<Item> findByCategory(Long categoryId){
		
		return items.stream().filter(a -> a.categoryId().equals(categoryId)).toList();

	}
}
