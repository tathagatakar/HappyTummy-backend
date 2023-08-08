package com.happyTummy.service;
import com.happyTummy.exceptions.ResourceNotFoundException;
import java.util.List;
import java.util.Optional;
import com.happyTummy.model.Dish;

public interface IDishService {
	/**
	 * Find all dishes.
	 * @return List of Dish objects.
	 */
	List<Dish> findAllDishes();
	
	/**
	 * Create a new dish.
	 * @param newDish Dish object to be created.
	 * @return Success message or error message.
	 */
	String createDish(Dish newDish);
	
	/**
	 * Get a dish by its ID.
	 * @param id ID of the dish to be retrieved.
	 * @return Optional of Dish object if found, otherwise throws ResourceNotFoundException.
	 * @throws ResourceNotFoundException if dish with the given ID is not found.
	 */
	Optional<Dish> getDishById(int id) throws ResourceNotFoundException;
	
	/**
	 * Update a dish by its ID.
	 * @param dish Dish object with updated information.
	 * @param id ID of the dish to be updated.
	 * @return Success message or error message.
	 */
	String updateDish(Dish dish, int id);
	
	/**
	 * Get a dish by its dish ID.
	 * @param id Dish ID of the dish to be retrieved.
	 * @return Dish object if found, otherwise null.
	 */
	Dish getDishByDishID(int id);
	
	/**
	 * Delete a dish by its ID.
	 * @param id ID of the dish to be deleted.
	 * @return 1 if dish is deleted successfully, otherwise -1.
	 */
	int deleteDish(int id);
}