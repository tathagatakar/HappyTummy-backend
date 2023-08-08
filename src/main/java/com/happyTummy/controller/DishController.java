package com.happyTummy.controller;

import java.util.List;
import java.util.Optional;
import com.happyTummy.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.happyTummy.model.Dish;
import com.happyTummy.service.IDishService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DishController {
	@Autowired
	IDishService dishService;
	
	// Get all dishes
	@GetMapping(path= "/dishitems", produces= {MediaType.APPLICATION_JSON_VALUE})
	List<Dish> Dishes() {
		return dishService.findAllDishes();
	}
	
	// Get dish by dish ID
	@GetMapping("/dishitems/{id}")
	Optional<Dish> findByDishId(@PathVariable int id) throws ResourceNotFoundException {
		return dishService.getDishById(id);
	}
	
	// Get dish by dish ID
	@GetMapping("/dishes/{id}")
	public Dish getDishByDishID(@PathVariable int id)  {
		return dishService.getDishByDishID(id);
	}
	
	// Create a new dish
	@PostMapping ("/dishitem")
	public String createDish (@RequestBody Dish newAirline) {
		return dishService.createDish(newAirline);
	}
	
	// Update dish by dish ID
	@PutMapping(path="/dishitems/{id}")
	public String updateDish(@RequestBody Dish air, @PathVariable int id) {
		return dishService.updateDish(air, id);
	}
	
	// Delete dish by dish ID
	@DeleteMapping(path="/dishesdelete/{id}")
	public int deleteDish(@PathVariable int id) {
		return dishService.deleteDish(id);
	}
}
