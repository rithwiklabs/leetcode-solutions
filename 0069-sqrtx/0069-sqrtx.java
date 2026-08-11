class Solution {
    public int mySqrt(int x) 
    {
        if(x==0 || x ==1)
            return x;
        long left=0;
        long right=x;
        while(left<=right)
        {
            long mid = left+(right-left)/2;
            if(mid * mid == (long)x) 
                return (int)mid;
            else if(mid * mid > (long) x)
                right = mid -1;
            else 
                left=mid+1;
        }
        return Math.round(right);
    }
}