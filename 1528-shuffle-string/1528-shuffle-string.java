class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder res = new StringBuilder();
        char[] ch = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ch[indices[i]]=s.charAt(i);
        }
        res.append(ch);
        return res.toString();
    }
}