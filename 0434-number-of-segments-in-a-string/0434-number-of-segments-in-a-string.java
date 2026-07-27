class Solution {
    public int countSegments(String s) {
        int ans=0;
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ' && flag==0)
            {
                ans++;
                flag=1;
            }
            if(s.charAt(i)==' ')
                flag=0;
        }
        return ans;
    }
}