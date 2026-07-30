class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightsum=0,leftsum=0;
        int[] ans = new int[nums.length];
        for(int n : nums)
            rightsum+=n;

        for(int i=0;i<nums.length;i++)
        {
            rightsum-=nums[i];
            ans[i]=Math.abs(leftsum-rightsum);
            leftsum+=nums[i];
        }
        return ans;
    }
}