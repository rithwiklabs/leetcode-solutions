class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(words.size() != s.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            String wrd=words.get(i);
            if(wrd.charAt(0)!=s.charAt(i))
                return false;
        }
        return true;
    }
}