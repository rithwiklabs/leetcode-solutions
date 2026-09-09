class Solution {
    public long countCommas(long n) {
        if(n<1000)
            return 0;
        long com=0,start=1000;
        while(start<=n)
        {
            com +=n-start+1;
            start*=1000;
        }
        return com;
    }
}