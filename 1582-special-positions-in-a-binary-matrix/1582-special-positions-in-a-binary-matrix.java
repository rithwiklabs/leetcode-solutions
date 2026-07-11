class Solution {
    public int numSpecial(int[][] matrix) 
    {
        int ans=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int[] rc=new int[m];
        int[] cc=new int[n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(matrix[i][j]==1) {
                    rc[i]++;
                    cc[j]++;
                }
            }
        }    
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if (matrix[i][j]==1 && rc[i]==1 && cc[j]==1)
                    ans++;
            }
        }
        return ans;
    }
}