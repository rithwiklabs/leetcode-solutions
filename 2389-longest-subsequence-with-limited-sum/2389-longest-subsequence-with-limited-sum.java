class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int n= nums.length,m=queries.length ,ans[] = new int[m];
        for(int i=1;i<n;i++)
            nums[i]+=nums[i-1];
        for(int i=0;i<m;i++)
        {
            int left =0 , high=n-1,count=0;
            while(left<=high)
            {
                int mid=left+(high-left)/2;
                if(nums[mid]<=queries[i])
                {
                    count=mid+1;
                    left=mid+1;
                }
                else
                    high=mid-1;
            }
            ans[i]=count;
        }
        return ans;
    }
}