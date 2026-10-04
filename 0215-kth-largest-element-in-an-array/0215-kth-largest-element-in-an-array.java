class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int ele : nums)
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        for(int ele : map.keySet())
        {
            k-=map.get(ele);
            if(k<=0)
                return ele;
        }
        return -1;
    }
}