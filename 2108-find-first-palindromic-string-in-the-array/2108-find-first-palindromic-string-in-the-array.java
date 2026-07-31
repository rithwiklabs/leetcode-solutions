class Solution {
    public static boolean isPalindrome(String str)
    {
        StringBuilder rev = new StringBuilder(str);
        return str.equals(rev.reverse().toString());
    }
    public String firstPalindrome(String[] words) {
        for(String str : words)
        {
            if(isPalindrome(str))
            {
                return str;
            }
        }
        return "";
    }
}