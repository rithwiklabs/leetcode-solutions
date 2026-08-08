class Solution {
    public static boolean isPresent(int[] num, int key)
    {
        for(int val : num)
        {
            if(val==key)
                return true;
        }
        return false;
    }
    public int findFinalValue(int[] nums, int original) {
        int res=original;
        while(isPresent(nums,res))
        {
            res*=2;
        }
        return res;
    }
}