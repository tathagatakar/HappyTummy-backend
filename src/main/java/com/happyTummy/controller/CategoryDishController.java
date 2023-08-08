package com.happyTummy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happyTummy.model.Dish;
import com.happyTummy.service.ICategoryDishService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CategoryDishController {
	@Autowired
	ICategoryDishService categoryDishService;
	
	/**
	 * Get all dishes by categoryId.
	 * @param _categoryId The categoryId to get dishes for.
	 * @return A list of Dish objects.
	 */
	@GetMapping("/alldishes/{_categoryId}")
	public List<Dish>getAllCatByCategoryId(@PathVariable int _categoryId){
		return categoryDishService.getAllDishByCategoryId(_categoryId);
	}
	
	public CategoryDishController() {
	}
}
