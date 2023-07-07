package com.in28minutes.rest.webservices.restfulwebservices.error;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The error details class.
 *
 * @author ayesa - architecture
 * @version jdk 1.17
 * @since Jul 7, 2023 - 6:25:43 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {

    private LocalDateTime timestamp;
    private String message;
    private String details;

}
