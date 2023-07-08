package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
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

    @Size(min = 2, message = "Name should have atleast 2 characters")
    private String name;

    @Past(message = "Birth Date should be in the past")
    private LocalDate birthDate;

}
