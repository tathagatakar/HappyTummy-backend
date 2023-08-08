package com.happyTummy.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.happyTummy.exceptions.ResourceNotFoundException;
import com.happyTummy.model.Category;
import com.happyTummy.repository.CategoryDAO;
@Service
public class CategoryService implements ICategoryService {
	@Autowired
	CategoryDAO categoryDao; // Dependency injection of CategoryDAO

	@Override
	// Retrieve all categories using CategoryDAO
	public List<Category> findAllCategories() {
		return categoryDao.getAllCategories();
	}

	@Override
	// Create a new category using CategoryDAO, and return success or error message based on the result
	public String createCategory(Category newCategory) {
		if (categoryDao.saveCategory(newCategory) == 1) {
			return "added successfully";
		} else {
			return "error";
		}
	}

	@Override
	// Retrieve a category by ID using CategoryDAO, and wrap it in Optional, throwing ResourceNotFoundException if not found
	public Optional<Category> getCategoryById(int id) throws ResourceNotFoundException {
		Optional<Category> updatedMenu = Optional.of(categoryDao.findbyId(id)
				.orElseThrow(()-> new ResourceNotFoundException("Category is not available with id: "+id)));;
		return updatedMenu;
	}

	@Override
	// Update a category by ID using CategoryDAO, and return success or error message based on the result
	public String updateCategory(Category category, int id) {
		if (categoryDao.updateCategory(category, id) == 1) {
			return "updated successfully";
		} else {
			return "error";
		}
	}

}
