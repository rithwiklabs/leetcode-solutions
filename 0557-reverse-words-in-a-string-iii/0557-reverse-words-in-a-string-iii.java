class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++ )
        {
            char[] ch = str[i].toCharArray();
            int left=0,right=ch.length-1;
            while(left<right)
            {
                char temp = ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
            str[i]=new String(ch);

        }
        return String.join(" ",str);
    }
}