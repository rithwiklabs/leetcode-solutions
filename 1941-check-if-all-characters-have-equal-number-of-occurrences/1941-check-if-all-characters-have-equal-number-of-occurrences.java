class Solution {
    public boolean areOccurrencesEqual(String str) {
        Map<Character, Integer> s = new HashMap<>();
        for(char c : str.toCharArray())
        {
            s.put(c,s.getOrDefault(c,0)+1);
        }
        int freq=-1;
        for(Integer val : s.values())
        {
            if(freq==-1)
                freq=val;
            if(freq!=val)
                return false;
        }
        return true;
    }
}