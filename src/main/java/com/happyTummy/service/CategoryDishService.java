package com.happyTummy.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.happyTummy.model.CategoryDish;
import com.happyTummy.model.Dish;
import com.happyTummy.repository.CategoryDishDAO;
import com.happyTummy.repository.DishDAO;
@Service
public class CategoryDishService implements ICategoryDishService {
	@Autowired
	CategoryDishDAO categoryDishRepository;

	@Autowired
	DishDAO dishRepository;
	
	/**
	 * Get all dishes by categoryId.
	 * @param _categoryID The categoryId to get dishes for.
	 * @return A list of Dish objects.
	 */
	
	@Override
	public List<Dish> getAllDishByCategoryId(int _categoryID) {
		
		List<Dish> dishes = new ArrayList<>();
		List<CategoryDish> dishesByCategoryId = categoryDishRepository.getAllDishByCategoryId(_categoryID);
		
		System.out.println(dishesByCategoryId+"--------------------");
		
		for(CategoryDish dishByCategoryId: dishesByCategoryId) {
			Dish dish = dishRepository.getDishByDishID(dishByCategoryId.get_dishId());
			dishes.add(new Dish(dish.get_dishId(),dish.get_dishName(),dish.get_dishDescription(),dish.get_dishPrice(),dish.get_dishImage(),dish.get_nature()));
		}
		return dishes;
	}
}

