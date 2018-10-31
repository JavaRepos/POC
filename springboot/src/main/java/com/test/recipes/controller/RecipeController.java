package com.test.recipes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.recipes.model.Category;
import com.test.recipes.model.Recipe;
import com.test.recipes.util.RecipesData;

@RestController
public class RecipeController {

	List<Recipe> recipes;
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	
	@RequestMapping("/list")
	public List<Category> showList() {
		
		RecipesData data = new RecipesData();
		return data.populateData();
		 
	}
	
}
