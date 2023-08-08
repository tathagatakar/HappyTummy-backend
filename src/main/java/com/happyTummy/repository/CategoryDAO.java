package com.happyTummy.repository;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.happyTummy.model.Category;

@Repository
public class CategoryDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	// RowMapper to map database result set to Category objects
	private org.springframework.jdbc.core.RowMapper<Category> rowMapper = (ResultSet rs, int rowNum)->{
		Category category = new Category();
		category.set_categoryId(rs.getInt(1));
		category.set_categoryName(rs.getString(2));
		category.set_categoryDescription(rs.getString(3));
		category.set_categoryImage(rs.getString(4));
		return category;
	};
	
	// Retrieve all categories from the database
	public List<Category> getAllCategories(){
		return jdbcTemplate.query("SELECT * FROM category", rowMapper);
	}
	
	// Retrieve a category by ID from the database and return it as Optional
	public Optional<Category> findbyId(int id) {
		String sql="SELECT * FROM category WHERE categoryID='"+id+"' ";
		return jdbcTemplate.query(sql, rowMapper).stream().findFirst();
	}
	
	// Retrieve a category by ID from the database
	public Category getCategoryById(int _categoryID) {
		String sql = "select * from Category where CategoryID ='"+_categoryID+"' ";
		return jdbcTemplate.queryForObject(sql, rowMapper);
	}
	
	// Save a new category to the database and return the number of rows affected
	public int saveCategory(Category category) {
		String query="insert into category values( '"+category.get_categoryId()+"','"+category.get_categoryName()+"','"+category.get_categoryDescription()+"','"+category.get_categoryImage()+"')";
		return jdbcTemplate.update(query);
	}
	// Update a category in the database and return the number of rows affected
	public int updateCategory(Category pm , int id) {
		return jdbcTemplate.update("update category set categoryNAME='"+ pm.get_categoryName() + "', categoryDESCRIPTION='" + pm.get_categoryDescription() + "', categoryIMAGE='" + pm.get_categoryImage() + "' where categoryID='" +id +"';");
	}
}
