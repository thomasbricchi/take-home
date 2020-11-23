package com.orderdetail.orderdetailapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderDetailsController {

    @GetMapping("/orders")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "orders";
    }
}
