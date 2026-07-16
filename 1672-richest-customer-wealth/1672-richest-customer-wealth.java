class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans=0;
        int m=accounts.length,n=accounts[0].length;
        for(int i=0;i<m;i++)
        {
            int temp=0;
            for(int j=0;j<n;j++)
            {
                temp+=accounts[i][j];
            }
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}