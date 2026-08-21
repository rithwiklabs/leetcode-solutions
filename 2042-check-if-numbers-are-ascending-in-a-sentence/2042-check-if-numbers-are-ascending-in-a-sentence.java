class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str = s.split(" ");
        int prev=0;
        for(int i=0;i<str.length;i++)
        {
            char[] ch = str[i].toCharArray();
            if(ch[0] >= '0' && ch[0] <= '9'){
                int cur=Integer.parseInt(str[i]);
                if(cur<=prev)
                    return false;
                prev=cur;
            }
        }
        return true;
    }
}