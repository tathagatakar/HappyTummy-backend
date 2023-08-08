package com.happyTummy.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import com.happyTummy.model.Common;

@Repository
public class CommonDAO {
    @Autowired
     private JdbcTemplate jdbcTemplate; // Autowire an instance of JdbcTemplate to be used for database operations
    
     // Define a row mapper to map ResultSet to Common objects
     private org.springframework.jdbc.core.RowMapper<Common> rowMapper = (ResultSet rs, int rowNum) ->{
     Common common = new Common();
     common.set_dishName(rs.getString(1));
     common.set_categoryName(rs.getString(2));
     common.set_menuName(rs.getString(3));
     common.set_dishPrice(rs.getDouble(4));
     common.set_dishImage(rs.getString(5));
     common.set_nature(rs.getString(6));
     return common;
     };
    
     public List<Common> getAll() {
    	// Execute a SQL query to retrieve all Common objects from the database using JdbcTemplate
    	 return jdbcTemplate.query("SELECT d.DishName, c.CategoryName, m.MenuName, d.DishPrice, d.DishImage, d.Nature FROM Dish d JOIN CategoryDish cd ON d.DishID = cd.DishID JOIN Category c ON cd.CategoryID = c.CategoryID JOIN MenuCategory mc ON c.CategoryID = mc.CategoryID JOIN Menu m ON mc.MenuID = m.MenuID;", rowMapper);
     }
    
     public Optional<Common> findbyId(int _dishID) {
     // TODO Auto-generated method stub
     return null;
     }
}
