package com.happyTummy.service;

import java.util.List;
import com.happyTummy.model.Dish;

public interface ICategoryDishService {
	List<Dish> getAllDishByCategoryId(int id);
}
