package com.happyTummy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happyTummy.exceptions.ResourceNotFoundException;
import com.happyTummy.model.Menu;
import com.happyTummy.service.IMenuService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MenuController {
	@Autowired
	IMenuService menuService;
	
	// Define a GET endpoint for the root URL "/" that returns a string message.
	@GetMapping("/")
	String MenuMessage() {
		return ("Menus have been added");
	}
	
	// Define a GET endpoint for "/menuitems" URL that returns a list of Menu objects.
	@GetMapping(path= "/menuitems")
	List<Menu> Menus() {
		return menuService.findAllMenus();
	}
	
	// Define a GET endpoint for "/menuitems/{id}" URL that retrieves a Menu object by its ID and returns it as an Optional object.
	// Include exception handling for ResourceNotFoundException that can be thrown when the requested Menu resource is not found.
	@GetMapping("/menuitems/{id}")
	Optional<Menu> findByMenuId(@PathVariable int id) throws ResourceNotFoundException {
		return menuService.getMenuById(id);
	}
	
	// Define a POST endpoint for "/menuitem" URL that creates a new Menu object by reading the request body.
	@PostMapping ("/menuitem")
	public String createMenu (@RequestBody Menu newAirline) {
		return menuService.createMenu(newAirline);
	}
	
	// Define a PUT endpoint for "/menuitems/{id}" URL that updates an existing Menu object by its ID and reading the request body.
	@PutMapping(path="/menuitems/{id}")
	public String updateMenu(@RequestBody Menu air, @PathVariable int id) {
		return menuService.updateMenu(air, id);
	}
}
