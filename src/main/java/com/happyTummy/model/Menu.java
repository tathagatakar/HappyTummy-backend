package com.happyTummy.model;

public class Menu {
	private int _menuId; // Declare a private integer variable "_menuId" to store the Menu ID.
	private String _menuName, _menuDescription, _menuImage; // Declare private string variables for storing Menu Name, Description, and Image.
	
	// Define a default constructor for the Menu class.
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// Define a parameterized constructor for the Menu class that initializes the private variables with provided values.
	public Menu(int _menuId, String _menuName, String _menuDescription, String _menuImage) {
		super();
		this._menuDescription=_menuDescription;
		this._menuId=_menuId;
		this._menuImage=_menuImage;
		this._menuName=_menuName;
	}
	
	// Define getter and setter methods for accessing and modifying the private variables of the Menu class.
	public int get_menuId() {
		return _menuId;
	}
	public void set_menuId(int _menuId) {
		this._menuId = _menuId;
	}
	public String get_menuName() {
		return _menuName;
	}
	public void set_menuName(String _menuName) {
		this._menuName = _menuName;
	}
	public String get_menuDescription() {
		return _menuDescription;
	}
	public void set_menuDescription(String _menuDescription) {
		this._menuDescription = _menuDescription;
	}
	public String get_menuImage() {
		return _menuImage;
	}
	public void set_menuImage(String _menuImage) {
		this._menuImage = _menuImage;
	}	
}