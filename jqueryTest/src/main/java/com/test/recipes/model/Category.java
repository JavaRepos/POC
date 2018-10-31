package com.test.recipes.model;

import java.util.List;

public class Category {

	

	private String name;
	
	private List<Recipe> recipes;


	public Category(String name, List<Recipe> recipes) {
		super();
		this.name = name;
		this.recipes = recipes;
	}
	
	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
