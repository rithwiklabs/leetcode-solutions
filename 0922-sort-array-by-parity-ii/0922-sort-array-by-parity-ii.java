class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ept=0,opt=1;
        while(ept<nums.length && opt < nums.length)
        {
            if(nums[ept]%2==0)
                ept+=2;
            else if(nums[opt]%2!=0)
                opt+=2;
            else
            {
                int temp=nums[ept];
                nums[ept]=nums[opt];
                nums[opt]=temp;
                ept+=2;
                opt+=2;
            }
        }
        return nums;
    }
}