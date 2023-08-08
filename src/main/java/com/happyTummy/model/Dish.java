package com.happyTummy.model;

public class Dish {
	private int _dishId; // ID of the dish
	private double _dishPrice; // Price of the dish
	private String _dishName, _dishDescription, _dishImage, _nature; // Name, description, image, and nature of the dish
	private boolean _isDeleted; // Flag to indicate if the dish is deleted or not
	
	// Default constructor
	public Dish() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Constructor that takes field values as parameters.
	public Dish(int _dishId, String _dishName, String _dishDescription, double _dishPrice, String _dishImage, String _nature) {
		super();
		this._dishId = _dishId;
		this._dishName = _dishName;
		this._dishDescription = _dishDescription;
		this._dishPrice = _dishPrice;
		this._dishImage = _dishImage;
		this._nature = _nature;
	}
	
	// Define getter and setter methods for accessing and modifying the private variables
	public int get_dishId() {
		return _dishId;
	}
	public void set_dishId(int _dishId) {
		this._dishId = _dishId;
	}
	public String get_dishName() {
		return _dishName;
	}
	public void set_dishName(String _dishName) {
		this._dishName = _dishName;
	}
	public String get_dishDescription() {
		return _dishDescription;
	}
	public void set_dishDescription(String _dishDescription) {
		this._dishDescription = _dishDescription;
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
	public String get_nature() {
		return _nature;
	}
	public void set_nature(String _nature) {
		this._nature = _nature;
	}
	public boolean is_isDeleted() {
		return _isDeleted;
	}
	public void set_isDeleted(boolean _isDeleted) {
		this._isDeleted = _isDeleted;
	}
}
