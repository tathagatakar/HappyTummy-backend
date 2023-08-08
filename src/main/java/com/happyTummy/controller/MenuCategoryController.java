package com.happyTummy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.happyTummy.model.Category;
import com.happyTummy.service.IMenuCategoryService;
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")

@RestController
public class MenuCategoryController {
	@Autowired
	IMenuCategoryService menuCategoryService; // Injects an instance of IMenuCategoryService using Spring's dependency injection
	
	// Handles GET requests for the specified URL path
	@GetMapping("/allcategories/{_menuID}")
	public List<Category> getAllCatByMenuId(@PathVariable int _menuID){
		return menuCategoryService.getAllCatByMenuId(_menuID);
	}

	public MenuCategoryController() {
		// TODO Auto-generated constructor stub
	}
}
