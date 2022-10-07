package com.yash.spring_assignment.Spring;

public class PrintMessage {
	
	private String Message;

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	@Override
	public String toString() {
		return "PrintMessage [Message=" + Message + "]";
	}

	
	

}
