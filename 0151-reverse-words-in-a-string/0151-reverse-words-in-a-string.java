class Solution {
    public String reverseWords(String s) {
        String[] res = s.trim().split("\\s+");
        int n = res.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = res[i];
            res[i] = res[n - 1 - i];
            res[n - 1 - i] = temp;
        }
        return String.join(" ", res);
    }
}