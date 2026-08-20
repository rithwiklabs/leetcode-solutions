class Solution {
    public char findTheDifference(String s, String t) {
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        for(int i=0;i<str2.length;i++)
        {
            boolean found = false;
            for(int j=0;j<str1.length;j++)
            {
                if(str2[i] == str1[j]){
                    str1[j]='#';
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                return str2[i];
            }
        }
        return ' ';
    }
}