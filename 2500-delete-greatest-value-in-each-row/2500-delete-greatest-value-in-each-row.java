class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            Arrays.sort(grid[i]);
        }
        for(int j=0;j<grid[0].length;j++)
        {
            int maxval=0;
            for(int i=0;i<grid.length;i++)
            {
                maxval=Math.max(maxval,grid[i][j]);
            }
            ans+=maxval;
        }
        return ans;
    }
}