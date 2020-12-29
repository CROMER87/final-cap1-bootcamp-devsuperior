package com.romer.final_cap1.services.execeptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;	

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
