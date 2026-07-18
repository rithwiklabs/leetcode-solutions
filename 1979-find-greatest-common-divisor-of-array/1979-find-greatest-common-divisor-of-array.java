class Solution {
    public static int gcd(int a , int b)
    {
        if(b==0)
            return a;            
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) 
    {
        int mx=nums[0],mn=nums[0];
        for(int num : nums)
        {
            mx=Math.max(mx,num);
            mn=Math.min(mn,num);
        }    
        return gcd(mx,mn);
    }
}