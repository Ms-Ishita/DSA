class Solution {
    public boolean isPalindrome(int x) {
       {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Single-digit numbers including 0 are palindromes
        if (x < 10) {
            return true;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            if (reversed > Integer.MAX_VALUE / 10 || reversed < Integer.MIN_VALUE / 10) {
                return false;
            }
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        
        return original == reversed;
    }
    }
}