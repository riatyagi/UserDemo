package com.xpan.exception;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

public class UserDoesNotExistException extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;

    public UserDoesNotExistException() {
        super(ErrorConstants.INVALID_USER, "Invalid User", Status.NO_CONTENT);
    }
}
