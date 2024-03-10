package com.example.letEmCook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    @RequestMapping(value = "/recipe", method = RequestMethod.GET)
    public String getRecipes() {
        return "hello";
    }
}
