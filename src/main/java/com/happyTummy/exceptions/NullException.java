package com.happyTummy.exceptions;

@SuppressWarnings("serial")
//Constructor for NullException that takes a custom error message.
public class NullException extends Exception {
	public NullException(String message) {
		super(message);
	}
}
