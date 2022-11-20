package com.api.palindrome.controller;

import com.api.palindrome.service.FindClosestPalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/palindrom")
public class FindClosestPalindromeController {

    @Autowired
    FindClosestPalindromeService service;

    @GetMapping(path = "/closest-palindrom")
    public String getClosestPalindromeNumber(@RequestParam String number) {
        return service.getClosestPalindromeNumber(number);
    }

}
