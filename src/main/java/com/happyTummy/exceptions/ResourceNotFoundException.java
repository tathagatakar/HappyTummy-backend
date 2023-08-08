package com.happyTummy.exceptions;

@SuppressWarnings("serial")
//Constructor for ResourceNotFoundException that takes a custom error message.
public class ResourceNotFoundException extends Exception {
	public ResourceNotFoundException(String message) {
		super(message);
	}
}
