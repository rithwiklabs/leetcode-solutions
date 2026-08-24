class Solution {
    public String modifyString(String s) {
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='?')
            {
                char l = (i>0) ? ch[i-1] :' ';
                char r = (i+1<ch.length) ? ch[i+1] :' ';
                if(l != 'a' && r!='a') ch[i]='a';
                else if(l != 'b' && r!='b') ch[i]='b';
                else
                    ch[i]='c';
            }
        }
        return new String(ch);
    }
}