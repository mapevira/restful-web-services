package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The hello world controller.
 *
 * @author ayesa - architecture
 * @since jdk 1.17
 * @version Jun 30, 2023 - 8:19:11 PM
 *
 */
@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

}
