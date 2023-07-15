package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The name class.
 *
 * @author Ayesa - architecture
 * @since jdk 1.17
 * @version 15 Jul 2023 - 09:41:00
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Name {

    private String firstName;
    private String lastName;

}
