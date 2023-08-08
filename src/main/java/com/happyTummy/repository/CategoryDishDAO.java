package com.happyTummy.repository;

import org.springframework.stereotype.Repository;
import com.happyTummy.model.CategoryDish;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Repository
public class CategoryDishDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate; // JdbcTemplate for interacting with the database
	
	public CategoryDishDAO() {
	}
	
	// RowMapper to map ResultSet to CategoryDish objects
	private org.springframework.jdbc.core.RowMapper<CategoryDish> rowMapper = (ResultSet rs, int rowNum) ->{
		CategoryDish categoryDish = new CategoryDish();
		categoryDish.set_categoryId(rs.getInt(1));
		categoryDish.set_dishId(rs.getInt(2));
		return categoryDish;
	};
	// Retrieves a list of CategoryDish objects by category ID from the database
	public List<CategoryDish> getAllDishByCategoryId(int _categoryID) {
		String sql="SELECT * FROM categorydish WHERE CategoryID=?";
		return jdbcTemplate.query(sql, rowMapper , _categoryID);
	}
}
