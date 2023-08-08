package com.happyTummy.exceptions;

import java.sql.Date;
// Define a custom class "ErrorDetails" for encapsulating error details.
public class ErrorDetails {
	private java.util.Date timeStamp;
	private String message;
	private String details;
	
	// Constructor to initialize error details.
	public ErrorDetails(java.util.Date date, String message, String details) {
		this.timeStamp=date;
		this.details=details;
		this.message=message;
	}

	// Getter and setter methods for error details.
	public Date getTimeStamp() {
		return (Date)timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
}
