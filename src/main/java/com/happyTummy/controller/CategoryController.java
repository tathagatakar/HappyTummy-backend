package com.happyTummy.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happyTummy.exceptions.ResourceNotFoundException;
import com.happyTummy.model.Category;
import com.happyTummy.service.ICategoryService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CategoryController {
		@Autowired
		ICategoryService categoryService;
		// RESTful API endpoint for retrieving all categories as JSON
		@GetMapping(path= "/categoryitems", produces= {MediaType.APPLICATION_JSON_VALUE})
		List<Category> Categories() {
			return categoryService.findAllCategories();
		}
		// RESTful API endpoint for retrieving a category by ID as JSON
		@GetMapping("/categoryitems/{id}")
		Optional<Category> findByCategoryId(@PathVariable int id) throws ResourceNotFoundException {
			return categoryService.getCategoryById(id);
		}
		// RESTful API endpoint for creating a new category
		@PostMapping ("/categoryitem")
		public String createCategory (@RequestBody Category newCategory) {
			return categoryService.createCategory(newCategory);
		}
		// RESTful API endpoint for updating a category by ID
		@PutMapping(path="/categoryitems/{id}")
		public String updateCategory(@RequestBody Category category, @PathVariable int id) {
			return categoryService.updateCategory(category, id);
		}
}
