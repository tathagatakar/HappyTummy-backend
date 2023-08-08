package com.happyTummy.repository;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.happyTummy.model.Dish;

@Repository
public class DishDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// RowMapper to map ResultSet to Dish object
	private org.springframework.jdbc.core.RowMapper<Dish> rowMapper = (ResultSet rs, int rowNum)->{
		Dish dish = new Dish();
		dish.set_dishId(rs.getInt(1));
		dish.set_dishName(rs.getString(2));
		dish.set_dishDescription(rs.getString(3));
		dish.set_dishPrice(rs.getDouble(4));
		dish.set_dishImage(rs.getString(5));
		dish.set_nature(rs.getString(6));
		dish.set_isDeleted(rs.getBoolean(7));
		return dish;
	};
	// Fetches all dishes from the 'dish' table
	public List<Dish> getAllDishes(){
		return jdbcTemplate.query("SELECT * FROM dish", rowMapper);
	}
	// Fetches dish by ID from the 'dish' table
	public Optional<Dish> findbyId(int id) {
		String sql="SELECT * FROM dish WHERE dishID='"+id+"' ";
		return jdbcTemplate.query(sql, rowMapper).stream().findFirst();
	}
	// Saves a new dish to the 'dish' table
	public int saveDish(Dish dish) {
		String query="insert into dish values( '"+dish.get_dishId()+"','"+dish.get_dishName()+"','"+dish.get_dishDescription()+"','"+dish.get_dishPrice()+"','"+dish.get_dishImage()+"','"+dish.get_nature()+"')";
		return jdbcTemplate.update(query);
	}
	// Updates an existing dish in the 'dish' table
	public int updateDish(Dish pm , int id) {
		return jdbcTemplate.update("update dish set dishNAME='"+ pm.get_dishName() + "', dishDESCRIPTION='" + pm.get_dishDescription() + "', dishPRICE='" + pm.get_dishPrice() + "', dishIMAGE='" + pm.get_dishImage()+ "', nature='" + pm.get_nature()  + "' where dishID='" +id +"';");
	}
	// Fetches a dish by dishID from the 'dish' table
	public Dish getDishByDishID(int dishId) {
		String sql = "select * from Dish where DishID = ? ";
		return jdbcTemplate.queryForObject(sql, rowMapper , dishId);
	}
	// Deletes a dish by ID from the 'dish' table
	public int deleteDish(int id) {
		String sql = "update Dish set is_deleted=? where DishID='"+id+"';";
		return jdbcTemplate.update(sql,true);
	}
}
