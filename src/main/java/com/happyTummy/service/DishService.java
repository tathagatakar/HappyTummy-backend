package com.happyTummy.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happyTummy.exceptions.ResourceNotFoundException;
import com.happyTummy.model.Dish;
import com.happyTummy.repository.DishDAO;
@Service
public class DishService implements IDishService {
	
	@Autowired
	DishDAO dishDao;
	/**
	 * Retrieve all dishes.
	 * @return List of Dish objects.
	 */
	@Override
	public List<Dish> findAllDishes() {
		return dishDao.getAllDishes();
	}
	/**
	 * Create a new dish.
	 * @param newDish Dish object to be created.
	 * @return Success message if dish is added successfully, otherwise error message.
	 */
	@Override
	public String createDish(Dish newDish) {
		if (dishDao.saveDish(newDish) == 1) {
			return "added successfully";
		} else {
			return "error";
		}
	}
	/**
	 * Get a dish by its ID.
	 * @param id ID of the dish to be retrieved.
	 * @return Optional of Dish object if found, otherwise throws ResourceNotFoundException.
	 * @throws ResourceNotFoundException if dish with the given ID is not found.
	 */
	@Override
	public Optional<Dish> getDishById(int id) throws ResourceNotFoundException {
		Optional<Dish> updatedMenu = Optional.of(dishDao.findbyId(id)
				.orElseThrow(()-> new ResourceNotFoundException("Dish is not available with id: "+id)));
		return updatedMenu;
	}

	/**
	 * Update a dish by its ID.
	 * @param dish Dish object with updated information.
	 * @param id ID of the dish to be updated.
	 * @return Success message if dish is updated successfully, otherwise error message.
	 */
	@Override
	public String updateDish(Dish dish, int id) {
		if (dishDao.updateDish(dish, id) == 1) {
			return "updated successfully";
		} else {
			return "error";
		}
	}
	
	/**
	 * Get a dish by its dish ID.
	 * @param dishId Dish ID of the dish to be retrieved.
	 * @return Dish object if found, otherwise null.
	 */
	public Dish getDishByDishID(int dishId) {
		Dish dish= dishDao.getDishByDishID(dishId);
		return dish;
	}

	/**
	 * Delete a dish by its ID.
	 * @param id ID of the dish to be deleted.
	 * @return 1 if dish is deleted successfully, otherwise -1.
	 */
	@Override
	public int deleteDish(int id) {
		return dishDao.deleteDish(id);
	}

}
