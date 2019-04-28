package com.testyantra.springmvcpoc.model;

public class HelloModel2 {
	private String message;

	public String getMessage() {
		return message;
	}
	
	public String getMessage2() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "HelloModel [message=" + message + "]";
	}
	
}//End of Class
