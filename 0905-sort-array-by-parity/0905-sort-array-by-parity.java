class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int pt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                int temp=nums[pt];
                nums[pt]=nums[i];
                nums[i]=temp;
                pt++;
            }   
        }
        return nums;
    }
}