package com.test.recipes.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.test.recipes.model.Category;
import com.test.recipes.model.Recipe;


public class RecipesData {

	public List<Category> populateData(){
		
		List<Recipe> starterRecipes = Arrays.asList(new Recipe("Starter1","Starter1"),
				new Recipe("Starter2","Starter2"),
				new Recipe("Starter3","Starter3"));
		
		List<Recipe> mainRecipes = Arrays.asList(new Recipe("Main Course1","Main Course1"),
				new Recipe("Main Course2","Main Course2"),
				new Recipe("Main Course3","Main Course3"));
		
		List<Recipe> desertRecipes = Arrays.asList(new Recipe("Deserts1","Deserts1"),
				new Recipe("Deserts2","Deserts2"),
				new Recipe("Deserts3","Deserts3"));
		
		return Arrays.asList(new Category("Starters",starterRecipes),
				new Category("Main Course",mainRecipes),
				new Category("Deserts",desertRecipes));
		
		
	}
	
	
}
