class Solution {
    public String reversePrefix(String word, char ch) {
        int rgtidx=0;
        for(int i =0;i<word.length();i++)
        {
            if(ch == word.charAt(i))
            { 
                rgtidx=i;
                break;
            }    
        }
        int lftidx=0;
        char[] str = word.toCharArray();
        while(lftidx<=rgtidx)
        {
            char temp=' ';
            temp=str[lftidx];
            str[lftidx]=str[rgtidx];
            str[rgtidx]=temp;
            lftidx++;
            rgtidx--;
        }
        return new String(str);
    }
}