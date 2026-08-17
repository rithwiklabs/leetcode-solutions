class Solution {
    public String generateTheString(int n) {
        StringBuilder str = new StringBuilder();
        if((n&1) == 0)
            str.append("a".repeat(n-1)).append("b");
        else
            str.append("a".repeat(n));
        return str.toString();
    }
}