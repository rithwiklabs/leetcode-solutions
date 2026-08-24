class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        char[] ch = s.toCharArray();
        for(int left=0;left+2<ch.length;left++)
        {
            Set<Character> set = new HashSet<>();
            set.add(ch[left]);
            set.add(ch[left+1]);
            set.add(ch[left+2]);
            if(set.size()==3)
                count++;
        }
        return count;
    }
}