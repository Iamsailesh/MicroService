package com.exam.categoryservice.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.exam.categoryservice.model.Category;

@Repository
public class CategoryRepo {
	private List<Category> categorys = new ArrayList<>();

	public Category addCategory(Category category) {
		categorys.add(category);
		return category;
	}

	public Category findById(Long id) {
		return categorys.stream().filter(category -> Long.valueOf(category.getId()).equals(id)).findFirst()
				.orElseThrow();

	}

	public List<Category> findAll() {
		return categorys;
	}

}
