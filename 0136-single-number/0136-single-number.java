// class Solution {
//     public int singleNumber(int[] nums) {
//         int ans=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             ans=ans ^ nums[i];
//         }        
//         return ans;
//     }
// }
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hash = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        for(int num : nums)
        {
            if(hash.get(num)==1)
                return num;

        }
        return -1;
    }
}