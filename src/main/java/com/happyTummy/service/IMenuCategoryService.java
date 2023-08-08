package com.happyTummy.service;

import java.util.List;

import com.happyTummy.model.Category;

public interface IMenuCategoryService {
	List<Category> getAllCatByMenuId(int menuId); // Defines the contract for a service that retrieves categories by menu ID
}