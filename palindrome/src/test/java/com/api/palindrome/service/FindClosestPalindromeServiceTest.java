package com.api.palindrome.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { FindClosestPalindromeService.class })
class FindClosestPalindromeServiceTest {

    @Autowired
    FindClosestPalindromeService service;

    @Test
    @DisplayName("Given a input number, return closest Palindrome number.")
    void testGetClosestPalindromeNumber() {
        String input = "123";
        String output = service.getClosestPalindromeNumber(input);
        String expectedOutput = "121";

        Assertions.assertEquals(expectedOutput, output);
    }

}
