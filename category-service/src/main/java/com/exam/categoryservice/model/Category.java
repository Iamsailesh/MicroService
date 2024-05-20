package com.exam.categoryservice.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private long id;
	private String Name;
	private List<Item> items= new ArrayList<>();
	@Override
	public String toString() {
		return "CategoryModel [id=" + id + ", Name=" + Name + ", items=" + items + "]";
	}
	
	public Category(long id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Category() {}

}
