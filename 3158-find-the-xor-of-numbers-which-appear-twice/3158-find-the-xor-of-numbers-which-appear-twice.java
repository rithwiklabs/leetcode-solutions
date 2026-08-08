class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res=0;
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)==2)
                res^=num;
        }
        return res;
    }
}