package com.sunan.courseSpring.services.exceptions;

public class ResouceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResouceNotFoundException(Object id) {
		super("Resoucer not found! id" + id);
	}
}
