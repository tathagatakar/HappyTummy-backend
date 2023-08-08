package com.happyTummy.model;

public class Common {
	// Private fields
	private String _menuName, _categoryName, _dishName, _dishImage, _nature;
	private double _dishPrice;
	
	// default constructor
	public Common() {
		// TODO Auto-generated constructor stub
	}
	
	// Constructor with parameters
	public Common(String _menuName, String _categoryName, String _dishName, String _dishImage, String _nature,
			double _dishPrice) {
		super();
		this._menuName = _menuName;
		this._categoryName = _categoryName;
		this._dishName = _dishName;
		this._dishImage = _dishImage;
		this._nature = _nature;
		this._dishPrice = _dishPrice;
	}

	// Getter and Setter methods
	public String get_nature() {
		return _nature;
	}
	public void set_nature(String _nature) {
		this._nature = _nature;
	}
	public double get_dishPrice() {
		return _dishPrice;
	}
	public void set_dishPrice(double _dishPrice) {
		this._dishPrice = _dishPrice;
	}
	public String get_dishImage() {
		return _dishImage;
	}
	public void set_dishImage(String _dishImage) {
		this._dishImage = _dishImage;
	}
	public void set_menuName(String _menuName) {
		this._menuName = _menuName;
	}
	public String get_menuName() {
		return _menuName;
	}
	public String get_categoryName() {
		return _categoryName;
	}
	public void set_categoryName(String _categoryName) {
		this._categoryName = _categoryName;
	}
	public String get_dishName() {
		return _dishName;
	}
	public void set_dishName(String _dishName) {
		this._dishName = _dishName;
	}
}
