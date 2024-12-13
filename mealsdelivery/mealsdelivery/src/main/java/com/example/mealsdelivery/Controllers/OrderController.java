package com.example.mealsdelivery.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping
    public String createOrder(@RequestBody String order) {
        // Logic for creating an order
        return "Order created";
    }

    @GetMapping("/{id}")
    public String getOrderDetails(@PathVariable String id) {
        // Logic for retrieving order details
        return "Order details for " + id;
    }

    @PostMapping("/{id}/pay")
    public String processPayment(@PathVariable String id) {
        // Logic for processing payment
        return "Payment processed for order " + id;
    }
}


