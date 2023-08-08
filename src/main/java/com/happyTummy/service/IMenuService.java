package com.happyTummy.service;

import java.util.List;
import java.util.Optional;
import com.happyTummy.exceptions.ResourceNotFoundException;
import com.happyTummy.model.Menu;

public interface IMenuService {
	// Method to find all menus and return a list of menus.
	List<Menu> findAllMenus();
	
	// Method to create a new menu and return a success or error message.
	String createMenu(Menu newAir);
	
	// Method to retrieve a menu by its ID and return an Optional object.
	// Throws a "ResourceNotFoundException" if the menu is not found.
	Optional<Menu> getMenuById(int id) throws ResourceNotFoundException;
	
	// Method to update an existing menu and return a success or error message.
	String updateMenu(Menu air, int id);
}