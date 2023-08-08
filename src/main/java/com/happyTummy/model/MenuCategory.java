package com.happyTummy.model;

public class MenuCategory {
	private int _menuId, _categoryId, _displayOrder; // private instance variables
	
	public MenuCategory() { // default constructor
		super(); 
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized constructor
	public MenuCategory(int _menuId, int _categoryId, int _displayOrder) {
		super();
		this._menuId = _menuId;
		this._categoryId = _categoryId;
		this._displayOrder = _displayOrder;
	}
	
	//Define getter and setter methods for accessing and modifying the private variables
	public int get_menuId() {
		return _menuId;
	}
	public void set_menuId(int _menuId) {
		this._menuId = _menuId;
	}
	public int get_categoryId() {
		return _categoryId;
	}
	public void set_categoryId(int _categoryId) {
		this._categoryId = _categoryId;
	}
	public int get_displayOrder() {
		return _displayOrder;
	}
	public void set_displayOrder(int _displayOrder) {
		this._displayOrder = _displayOrder;
	}
}
