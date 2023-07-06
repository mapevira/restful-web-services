package com.in28minutes.rest.webservices.restfulwebservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The User not found exception.
 *
 * @author ayesa - architecture
 * @since jdk 1.17
 * @version Jul 6, 2023 - 8:14:02 PM
 *
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -6871806099020423394L;

    public UserNotFoundException(String message) {
        super(message);
    }

}
