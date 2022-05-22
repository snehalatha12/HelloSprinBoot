package com.example;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class HelloSpringBootApplication {



@GetMapping("/welcome")
public String welcome() {
return "Spring Boot Docker Demo";
}



public static void main(String[] args) {
SpringApplication.run(HelloSpringBootApplication.class, args);
}



}