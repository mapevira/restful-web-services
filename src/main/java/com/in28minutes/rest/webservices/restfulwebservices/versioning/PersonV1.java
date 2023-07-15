package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The firt version of person.
 *
 * @author Ayesa - architecture
 * @since jdk 1.17
 * @version 15 Jul 2023 - 09:33:47
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonV1 {

    private String name;

}
