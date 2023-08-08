package com.happyTummy.model;

public class Category {
	private int _categoryId; // private field to store the category ID
	private String _categoryName, _categoryDescription, _categoryImage; // private field to store the category name, category description, category image URL
	
	// Default constructor for the Category class.
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Constructor for the Category class that takes all field values as parameters.
	public Category(int _categoryId, String _categoryName, String _categoryDescription, String _categoryImage) {
		super();
		this._categoryId = _categoryId;
		this._categoryName = _categoryName;
		this._categoryDescription = _categoryDescription;
		this._categoryImage = _categoryImage;
	}
	
	// Define getter and setter methods for accessing and modifying the private variables of the Category class.
	public int get_categoryId() {
		return _categoryId;
	}
	public void set_categoryId(int _categoryId) {
		this._categoryId = _categoryId;
	}
	public String get_categoryName() {
		return _categoryName;
	}
	public void set_categoryName(String _categoryName) {
		this._categoryName = _categoryName;
	}
	public String get_categoryDescription() {
		return _categoryDescription;
	}
	public void set_categoryDescription(String _categoryDescription) {
		this._categoryDescription = _categoryDescription;
	}
	public String get_categoryImage() {
		return _categoryImage;
	}
	public void set_categoryImage(String _categoryImage) {
		this._categoryImage = _categoryImage;
	}
}
