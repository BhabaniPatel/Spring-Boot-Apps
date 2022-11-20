package com.api.palindrome.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { PalindromUtil.class })
class PalindromUtilTest {

    @Test
    @DisplayName("Given a input number, return closest Palindrome number.")
    void testClosestPalindrome() {
        int input = 123;
        String output = PalindromUtil.closestPalindrome(input);
        String expectedOutput = "121";

        Assertions.assertEquals(expectedOutput, output);
    }
    
    @Test
    @DisplayName("Given a input number, return closest Palindrome number.")
    void testPalindrome() {
        String input = "121";
        Boolean output = PalindromUtil.isPalindrome(input);

        Assertions.assertEquals(true, output);
    }

}
