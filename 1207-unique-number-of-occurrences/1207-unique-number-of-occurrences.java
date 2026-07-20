class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> h = new HashMap<>();
        for(int num : arr)
        {
            h.put(num,h.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int count : h.values())
        {
            if(set.contains(count))
                return false;
            set.add(count);
        }
        return true;
    }
}