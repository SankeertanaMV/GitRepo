package org.jnit.exceptions;

public class StepFailedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StepFailedException() {
		super();
	}

	public StepFailedException(String message) {
		super(message);
	}
	

}
