class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        String vowel ="aeiou";
        int res=0;
        for(int i=left;i<=right;i++)
        {
            char[] str = words[i].toCharArray();
            if( vowel.indexOf(str[0]) != -1  && vowel.indexOf(str[str.length-1]) != -1)
                res++;
        }
        return res;
    }
}