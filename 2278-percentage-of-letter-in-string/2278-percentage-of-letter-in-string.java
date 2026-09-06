class Solution {
    public int percentageLetter(String s, char letter) {
        int occ=0;
        for(char ch : s.toCharArray())
        {
            if(ch==letter)  occ++;
        }
        return (occ*100/s.length());
    }
}