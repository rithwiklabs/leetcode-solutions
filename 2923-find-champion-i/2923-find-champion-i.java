class Solution {
    public int findChampion(int[][] grid) {
        int cham=0,n=grid.length;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=grid[i][j];
            }
            if(sum==n-1){
                cham=i;
                break;
            }
        }
        return cham;
    }
}