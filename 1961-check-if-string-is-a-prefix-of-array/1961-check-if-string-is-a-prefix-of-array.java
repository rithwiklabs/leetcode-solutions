class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str = "";
        for(String ele : words)
        {
            str+=ele;
            if(str.equals(s))
                return true;
        }
        return false;
    }
}