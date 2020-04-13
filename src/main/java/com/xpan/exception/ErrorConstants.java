package com.xpan.exception;

import java.net.URI;

public final class ErrorConstants {
	 public static final URI INVALID_USER = URI.create("/user-does-not-exist");

	private ErrorConstants() {
		super();
	}
	 
}
