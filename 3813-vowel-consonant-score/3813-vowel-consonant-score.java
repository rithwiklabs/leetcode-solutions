class Solution {
    public int vowelConsonantScore(String s) {
        int v=0,c=0;
        String vowels="aeiou";
        for(char ch : s.toCharArray())
        {
            if(vowels.indexOf(ch) != -1){
                v++;
                continue;
            }
            if(Character.isAlphabetic(ch))
                c++;
        }
        return c==0 ? 0 : v/c ;
    }
}