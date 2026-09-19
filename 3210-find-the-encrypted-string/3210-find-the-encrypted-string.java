class Solution {
    public String getEncryptedString(String s, int k) {
        String res = "";
        int n = s.length();
        for(int i = 0; i < n; i++) {
            res += s.charAt((i + k) % n);
        }
        return res;
    }
}