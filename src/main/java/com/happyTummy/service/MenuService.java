package com.happyTummy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happyTummy.exceptions.ResourceNotFoundException;
import com.happyTummy.model.Menu;
import com.happyTummy.repository.MenuDAO;
//Define a service class named "MenuService" which implements "IMenuService" interface.
@Service
public class MenuService implements IMenuService {
	
	@Autowired
	MenuDAO menuDao; // Inject the "MenuDAO" dependency using Spring's Autowired annotation.

	// Implement the "findAllMenus()" method which returns a list of all menus.
	@Override
	public List<Menu> findAllMenus() {
		return menuDao.getAllMenus();
	}
	// Implement the "getMenuById(int id)" method which retrieves a menu by its ID.
	// If the menu is not found, it throws a "ResourceNotFoundException" with a custom error message.
	@Override
	public Optional<Menu> getMenuById(int id) throws ResourceNotFoundException {
		Optional<Menu> updatedMenu = Optional.of(menuDao.findbyId(id)
				.orElseThrow(()-> new ResourceNotFoundException("Menu is not available with id: "+id)));
		return updatedMenu;
	}
	// Implement the "createMenu(Menu newMenu)" method which creates a new menu and returns a success or error message.
	@Override
	public String createMenu(Menu newMenu) {
		if (menuDao.saveMenu(newMenu) == 1) {
			return "The menu has been added successfully";
		} else {
			return "Some error has occured";
		}
	}
	// Implement the "updateMenu(Menu m, int id)" method which updates an existing menu and returns a success or error message.
	@Override
	public String updateMenu(Menu m, int id) {
		if (menuDao.updateMenu(m, id) == 1) {
			return "The menu has been updated successfully";
		} else {
			return "Some error has occured plz enter the id properly";
		}
	}

}
