package com.api.palindrome.service;

import com.api.palindrome.util.PalindromUtil;
import org.springframework.stereotype.Service;

@Service
public class FindClosestPalindromeService {

    public String getClosestPalindromeNumber(String number) {
        return PalindromUtil.closestPalindrome(Integer.parseInt(number));
    }

}
