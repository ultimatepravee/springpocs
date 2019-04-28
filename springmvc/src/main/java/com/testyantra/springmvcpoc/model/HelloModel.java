package com.testyantra.springmvcpoc.model;

/**
 * Test Class
 * @author Praveen
 *
 */
public class HelloModel { // NOPMD by Praveen on 24/4/19 9:35 AM
	/**
	 * This for holding the Message
	 */
	private String message;

	/*
	 * This for holding the Message
	 */
	//This for holding the Message
	public String getMessage() {
		return message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "HelloModel [message=" + message + "]";
	}
	
}//End of Class
