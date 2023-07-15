package com.in28minutes.rest.webservices.restfulwebservices.versioning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The second version of person.
 *
 * @author Ayesa - architecture
 * @since jdk 1.17
 * @version 15 Jul 2023 - 09:40:05
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonV2 {

    private Name name;

}
