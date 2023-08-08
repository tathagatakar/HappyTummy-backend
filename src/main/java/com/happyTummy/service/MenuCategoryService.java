package com.happyTummy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happyTummy.model.Category;
import com.happyTummy.model.MenuCategory;
import com.happyTummy.repository.CategoryDAO;
import com.happyTummy.repository.MenuCategoryDAO;

@Service
public class MenuCategoryService implements IMenuCategoryService{
	@Autowired
	MenuCategoryDAO menuCategoryRepository; // Injects MenuCategoryDAO for data access
	
	@Autowired
	CategoryDAO categoryRepository; // Injects CategoryDAO for data access

	@Override
	public List<Category> getAllCatByMenuId(int menuId) {
		List<Category> categories = new ArrayList<>(); // List to store retrieved categories
		List<MenuCategory> categoriesByMenuId = menuCategoryRepository.getAllCatByMenuId(menuId);

		// Iterates through each MenuCategory object to get Category details
		for(MenuCategory categoryByMenuId: categoriesByMenuId) {
			Category category = categoryRepository.getCategoryById(categoryByMenuId.get_categoryId());  // Retrieves Category object by category ID from the data access layer
			// Adds retrieved Category object to the list of categories
			categories.add(new Category(category.get_categoryId(),category.get_categoryName(),category.get_categoryDescription(),category.get_categoryImage()));			
			} 
		return categories;
	}


}
