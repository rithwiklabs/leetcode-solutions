class Solution {
    public int balancedStringSplit(String s) {
        int bal=0,count=0;
        char[] str=s.toCharArray();
        for(int i=0;i<str.length;i++)
        {
            if(str[i]=='L')
                bal++;
            else
                bal--;
            if(bal==0)
                count+=1;
        }
        return count;
    }
}