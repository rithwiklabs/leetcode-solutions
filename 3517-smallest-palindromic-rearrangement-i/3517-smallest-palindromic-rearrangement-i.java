class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        String first;
        char mid = ' ';
        if (n % 2 == 0)
            first = s.substring(0, n / 2);
        else {
            first = s.substring(0, n / 2);
            mid = s.charAt(n / 2);
        }
        char[] fst = first.toCharArray();
        Arrays.sort(fst);
        StringBuilder ans = new StringBuilder();
        for (char ch : fst) {
            ans.append(ch);
        }
        StringBuilder rev = new StringBuilder(ans);
        rev.reverse();
        if(n%2==0)
            return ans.toString()+rev.toString();
        else
            return ans.toString() + mid + rev.toString(); 
    }
}