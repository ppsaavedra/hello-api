package com.proximus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GithubActionsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsApiApplication.class, args);
    }

    @RestController
    public class Hello {

        @GetMapping("/hello")
        public String sayHello(){
            return "Hello I m up and running.";
        }

    }

}
