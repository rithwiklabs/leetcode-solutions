class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int maxidx=0,minidx=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i] > nums[maxidx])
                maxidx=i;
            if(nums[i] < nums[minidx])
                minidx=i;
        }
        int left = Math.min(minidx, maxidx);
        int right = Math.max(minidx, maxidx);

        int leftCost = right + 1;
        int rightCost = n - left;
        int bothCost = (left + 1) + (n - right);

        return Math.min(leftCost, Math.min(rightCost, bothCost));
    }
}