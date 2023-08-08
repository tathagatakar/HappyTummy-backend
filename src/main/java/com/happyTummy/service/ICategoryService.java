package com.happyTummy.service;

import java.util.List;
import java.util.Optional;
import com.happyTummy.exceptions.ResourceNotFoundException;
import com.happyTummy.model.Category;

public interface ICategoryService {
	// Method for retrieving all categories
	List<Category> findAllCategories();
	
	// Method for creating a new category
	String createCategory(Category newCategory);
	
	// Method for retrieving a category by ID
	Optional<Category> getCategoryById(int id) throws ResourceNotFoundException;
	
	// Method for updating a category by ID
	String updateCategory(Category category, int id);
}
