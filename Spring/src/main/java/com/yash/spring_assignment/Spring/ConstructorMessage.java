package com.yash.spring_assignment.Spring;

public class ConstructorMessage {
	
	private String Message;

	public ConstructorMessage(String message) {
		super();
		Message = message;
	}

	@Override
	public String toString() {
		return "ConstructorMessage [Message=" + Message + "]";
	}
	
	

}
