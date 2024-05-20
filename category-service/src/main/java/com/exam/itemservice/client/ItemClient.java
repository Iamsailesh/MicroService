package com.exam.itemservice.client;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.HttpExchange;

import com.exam.categoryservice.model.Item;



@HttpExchange
public interface ItemClient {
	@GetMapping("/category/{categoryId}")
	public List<Item> findByCategory(@PathVariable("categoryId") Long categoryId);
}
