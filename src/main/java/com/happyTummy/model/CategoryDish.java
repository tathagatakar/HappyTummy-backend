package com.happyTummy.model;

public class CategoryDish {
	private int _categoryId, _dishId;
	
	//default constructor
	public CategoryDish() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor to initialize a CategoryDish object with given categoryId and dishId.
	 * @param _categoryId The categoryId to set.
	 * @param _dishId The dishId to set.
	 */
	
	
	public CategoryDish(int _categoryId, int _dishId) {
		super();
		this._categoryId = _categoryId;
		this._dishId = _dishId;
	}
	
	//getters and setters
	public int get_categoryId() {
		return _categoryId;
	}
	public void set_categoryId(int _categoryId) {
		this._categoryId = _categoryId;
	}
	public int get_dishId() {
		return _dishId;
	}
	public void set_dishId(int _dishId) {
		this._dishId = _dishId;
	}
	
}
