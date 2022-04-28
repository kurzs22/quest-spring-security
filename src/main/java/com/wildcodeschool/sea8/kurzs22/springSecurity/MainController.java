package com.wildcodeschool.sea8.kurzs22.springSecurity;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    
    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers..... Assemble";
    }

    @GetMapping("/secret-bases")
    public List<String> schools() {
        List<String> schools = Arrays.asList(
                    "Amsterdam",
                    "Barcelona",
                    "Berlin",
                    "Brussels",
                    "Bucharest",
                    "Lisbon",
                    "London",
                    "Madrid",
                    "Biarritz",
                    "Bordeaux",
    	            "La Loupe",
                    "Lille",
                    "Lyon",
                    "Marseille",
                    "Nantes",
                    "Orleans",
                    "Paris",
                    "Reims",
                    "Strasbourg",
                    "Toulouse",
                    "Tours"
                );

        return schools;
    }
}
