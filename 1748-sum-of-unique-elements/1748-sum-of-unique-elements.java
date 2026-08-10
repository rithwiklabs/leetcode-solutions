class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> hash = new HashMap<>();
        int sum=0;
        for(int num : nums)
        {
            hash.put(num,hash.getOrDefault(num,0)+1);
            if(hash.get(num)==1)
                sum+=num;
            
            if(hash.get(num)==2)
                sum-=num;
            
        }
        return sum;
    }
}