class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int pt1=0;
        int pt2=n;
        for(int i=0;i<n*2;i+=2)
        {
            res[i]=nums[pt1];
            res[i+1]=nums[pt2];
            pt1++;
            pt2++;
        }
        return res;
    }
}