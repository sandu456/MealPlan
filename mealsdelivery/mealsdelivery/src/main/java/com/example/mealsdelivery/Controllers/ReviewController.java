package com.example.mealsdelivery.Controllers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @PostMapping
    public String addReview(@RequestBody String review) {
        // Logic for adding a review
        return "Review added";
    }

    @GetMapping("/{mealId}")
    public String listReviews(@PathVariable String mealId) {
        // Logic for listing reviews for a meal
        return "Reviews for meal " + mealId;
    }
} 
