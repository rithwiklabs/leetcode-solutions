class Solution {
    public int digitFrequencyScore(int n) {
        int res=0;
        while(n>0)
        {
            int dig=n%10;
            res+=dig;
            n/=10;
        }
        return res;
    }
}