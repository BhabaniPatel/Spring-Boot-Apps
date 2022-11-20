package com.api.palindrome.util;

public class PalindromUtil {

    /**
     * Method to check Palindrome
     * 
     * @param input String
     * @return boolean result of Palindrome or not
     */
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * Method to return closest Palindrome number
     * 
     * @param input number
     * @return closest Palindrome of the input number
     */
    public static String closestPalindrome(int num) {

        /* Case-1 : largest Palindrome number.[which is smaller to given number] */
        int RPNum = num - 1;

        while (isPalindrome(Integer.toString(RPNum)) == false) {
            RPNum--;
        }

        /* Case-2 : smallest Palindrome number.[which is greater than given number] */
        int SPNum = num + 1;

        while (isPalindrome(Integer.toString(SPNum)) == false) {
            SPNum++;
        }

        // Check absolute difference
        if (Math.abs(num - SPNum) < Math.abs(num - RPNum)) {
            return String.valueOf(SPNum);
        } else
            return String.valueOf(RPNum);
    }

}
