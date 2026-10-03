class Solution {
    public boolean judgeSquareSum(int c) {
        // for(long a =0 ; a*a<=c;a++)
        // {
        //     double b = Math.sqrt(c-a*a);
        //     if(b== (int)b)  return true;
        // }
        long left=0,right=(long)Math.sqrt(c);
        while(left<=right)
        {
            if(left*left+right*right==c)
                return true;
            if(left*left+right*right>=c)
                right--;
            else
                left++;
        }
        return false;
    }
}