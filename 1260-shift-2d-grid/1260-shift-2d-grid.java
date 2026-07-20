class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            List<Integer> row = new ArrayList<Integer>();
            for(int j=0;j<n;j++)
            {
                row.add(0);
            }
            res.add(row);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int idx=i*n+j;
                int nidx=(idx+k)%(m*n);
                int nr=nidx/n;
                int nc=nidx%n;
                res.get(nr).set(nc,grid[i][j]);
            }
        }
        return res;
    }
}