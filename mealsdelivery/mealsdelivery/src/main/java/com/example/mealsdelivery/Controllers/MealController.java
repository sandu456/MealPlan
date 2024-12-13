package com.example.mealsdelivery.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/meals")
public class MealController {

    @GetMapping
    public String listMeals() {
        // Logic to list meals
        return "List of meals";
    }

    @GetMapping("/{id}")
    public String getMealDetails(@PathVariable String id) {
        // Logic to get meal details
        return "Meal details for " + id;
    }
}

