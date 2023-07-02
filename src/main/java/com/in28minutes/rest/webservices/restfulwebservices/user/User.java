package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The user class.
 *
 * @author ayesa - architecture
 * @since jdk 1.17
 * @version Jul 2, 2023 - 5:41:04 PM
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;
    private String name;
    private LocalDate birthDate;

}
