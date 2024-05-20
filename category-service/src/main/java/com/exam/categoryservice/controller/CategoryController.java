package com.exam.categoryservice.controller;

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

import com.exam.categoryservice.model.Category;
import com.exam.categoryservice.repo.CategoryRepo;
import com.exam.itemservice.client.ItemClient;


@RestController
@RequestMapping("/category")
public class CategoryController {
	private static final Logger LOGGER = LoggerFactory.getLogger(CategoryController.class);
	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ItemClient itemClient;

	@PostMapping
	public Category add(@RequestBody Category category) {
		LOGGER.info("Item add: {}", category);
		return categoryRepo.addCategory(category);
	}

	@GetMapping
	public List<Category> findAll() {
		LOGGER.info("Category find");
		return categoryRepo.findAll();
	}

	@GetMapping("/{id}")
	public Category findById(@PathVariable Long id) {
		LOGGER.info("Item find: id={}", id);
		return categoryRepo.findById(id);
	}
	
	
}
