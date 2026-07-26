class Solution {
    public int maxPower(String s) {
        int maxcount=0,count=0;
        char currch=' ';
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==currch)
            {
                count++;
            }
            else
            {
                count=1;
                currch=ch;
            }
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}