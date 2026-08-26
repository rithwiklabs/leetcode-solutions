class Solution {
    public int firstMatchingIndex(String s) {
        char[] ch = s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<=right)
        {
            if(ch[left] == ch[right])
                return left;
            left++;
            right--;
        }
        return -1;
    }
}