class Solution {
    public boolean isPalindrome(int x) {
        // String str = String.valueOf(x);
        // return str.equals(new StringBuilder(str).reverse().toString());
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int xcopy = x;

        while (x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x /= 10;
        }
        return reverse == xcopy;        
    }
}