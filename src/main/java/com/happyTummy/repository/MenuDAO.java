package com.happyTummy.repository;

import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.happyTummy.model.Menu;
@Repository
public class MenuDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// Define a RowMapper to map database query results to Menu objects.
	private org.springframework.jdbc.core.RowMapper<Menu> rowMapper = (ResultSet rs, int rowNum)->{
		Menu menu = new Menu();
		menu.set_menuId(rs.getInt(1));
		menu.set_menuName(rs.getString(2));
		menu.set_menuDescription(rs.getString(3));
		menu.set_menuImage(rs.getString(4));
		return menu;
	};
	
	// Method to retrieve all menus from the database and return a list of menus.
	public List<Menu> getAllMenus(){
		return jdbcTemplate.query("SELECT * FROM MENU", rowMapper);
	}
	
	// Method to retrieve a menu by its ID from the database and return an Optional object.
	public Optional<Menu> findbyId(int id) {
		String sql="SELECT * FROM MENU WHERE MENUID='"+id+"' ";
		return jdbcTemplate.query(sql, rowMapper).stream().findFirst();
	}
	
	// Method to save a new menu to the database and return the number of rows affected.
	public int saveMenu(Menu menu) {
		String query="insert into MENU values( '"+menu.get_menuId()+"','"+menu.get_menuName()+"','"+menu.get_menuDescription()+"','"+menu.get_menuImage()+"')";
		return jdbcTemplate.update(query);
	}
	
	// Method to update an existing menu in the database and return the number of rows affected.
	public int updateMenu(Menu pm , int _menuId) {
		String sql = "update Menu set MenuName='" +pm.get_menuName() + "', MenuDescription='"+pm.get_menuDescription()+ "', MenuImage='"+pm.get_menuImage()+"' where MenuID='"+_menuId+"';";
		return jdbcTemplate.update(sql);
	}
}
