class Solution {
    public boolean checkRecord(String s) {
        int abs=0,late=0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == 'A')
            {
                abs++;
                if(abs>=2)   return false;
            }
            if(ch == 'L')
            {
                late++;
                if(late>=3)   return false;
            }
            else
                late=0;
        }
        return true;
    }
}