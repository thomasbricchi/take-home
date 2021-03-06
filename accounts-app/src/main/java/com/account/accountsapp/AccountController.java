package com.account.accountsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/accounts")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "accounts";
    }
}
