package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * The user controller.
 *
 * @author ayesa - architecture
 * @since jdk 1.17
 * @version Jul 2, 2023 - 5:53:42 PM
 *
 */
@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service) {
        super();
        this.service = service;
    }

    @GetMapping("users")
    public List<User> retrieveAllUsers() {
        return service.findAll();
    }

    @GetMapping("users/{id}")
    public User retrieveUser(@PathVariable int id) {
        return service.findOne(id);
    }

}
