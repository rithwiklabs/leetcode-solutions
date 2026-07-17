class Solution {
    public boolean searchMatrix(int[][] mat, int tg) {
        int m=mat.length,n=mat[0].length;
        int low=0,high=m*n-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int r=mid/n,c=mid%n;
            if(mat[r][c]==tg)
                return true;
            else if(mat[r][c]<tg)
                low=mid+1;
            else if(mat[r][c]>tg)
                high=mid-1;
        }
        return false;
    }
}