class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        int m=grid.length,n=grid[0].length;
        for(int r=0;r<m;r++)
        {
            if(r%2==0)
            {
                for(int c=0;c<n;c++)
                {
                    if((r+c)%2==0)
                        ans.add(grid[r][c]);
                }
            }
            else
            {
                for(int c=n-1;c>=0;c--)
                {
                    if((r+c)%2==0)
                        ans.add(grid[r][c]);
                }
            }
        }
        
        return ans;
    }
}