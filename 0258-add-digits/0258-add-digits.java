class Solution {
    public int addDigits(int num) {
        while(num>=10)
        {
            int res=0;
            while(num!=0)
            {
                int dig=num%10;
                res+=dig;
                num/=10;
            }
            num=res;
        }
        return num;
    }
}