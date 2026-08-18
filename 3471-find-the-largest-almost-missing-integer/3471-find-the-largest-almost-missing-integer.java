class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer,Integer> hash = new HashMap<>();
        for(int num : nums)
            hash.put(num,hash.getOrDefault(num,0)+1);
        if(k == nums.length)
        {
            int maxval = Integer.MIN_VALUE;
            for(int num : nums)
            {
                maxval=Math.max(maxval,num);
            }
            return maxval;
        }
        if(k==1)
        {
            int maxval=-1;
            for(int i=0;i<nums.length;i++){
                if(hash.get(nums[i]) ==1 && nums[i]>maxval)
                    maxval=nums[i];
            }
            return maxval;
        }
        int n = nums.length-1;
        if(nums[0]==nums[n])
            return -1;
        if(hash.get(nums[0])==1 && hash.get(nums[n])==1)
            return Math.max(nums[0],nums[n]);

        if(hash.get(nums[0])==1 && hash.get(nums[n])>1)
            return nums[0];
        if(hash.get(nums[0])>1 && hash.get(nums[n])==1)
            return nums[n];
        return -1;
    }
}