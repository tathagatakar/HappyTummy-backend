package com.happyTummy.repository;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.happyTummy.model.MenuCategory;

@Repository
public class MenuCategoryDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;  // JdbcTemplate for interacting with the database

	public MenuCategoryDAO() {
		// TODO Auto-generated constructor stub
	}
	// RowMapper to map ResultSet to MenuCategory objects
	private org.springframework.jdbc.core.RowMapper<MenuCategory> rowMapper = (ResultSet rs, int rowNum) ->{
		MenuCategory menuCategory = new MenuCategory();
		menuCategory.set_menuId(rs.getInt(1));	   
		menuCategory.set_categoryId(rs.getInt(2));  
		menuCategory.set_displayOrder(rs.getInt(3));  
		return menuCategory;
	};
	
	// Retrieves a list of MenuCategory objects by menu ID from the database
	public List<MenuCategory> getAllCatByMenuId(int menuId) {
		String sql="SELECT * FROM menucategory WHERE MenuID=?";
		return jdbcTemplate.query(sql, rowMapper , menuId);
	}

}