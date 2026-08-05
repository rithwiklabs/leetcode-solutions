class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> ele = new HashMap<>();
        int res=0,major=0;
        for(int num : nums)
        {
            ele.put(num,1+ele.getOrDefault(num,0));
            if(ele.get(num) > major)
            {
                res=num;
                major=ele.get(num);
            }
        }
        return res;
    }
}