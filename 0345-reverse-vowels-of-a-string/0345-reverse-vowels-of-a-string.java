class Solution {
    public static boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return ch=='a' ||ch=='e'||ch=='i'|| ch=='o'||ch=='u';
    }
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int l=0,h=s.length()-1;
        while(l<h)
        {
            while(l<h && !isVowel(word[l]))
                l++;
            while(l<h && !isVowel(word[h]))
                h--;
            char temp= word[l];
            word[l]=word[h];
            word[h]=temp;
            l++;h--;
        }
        return new String(word);
    }
}