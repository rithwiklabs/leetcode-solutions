class Solution {
    public boolean checkDivisibility(int num) {
        int n=num;
        int sum=0,prdt=1;
        while(n>0)
        {
            int dig=n%10;
            sum+=dig;
            prdt*=dig;
            n=n/10;
        }
        return num%(sum+prdt)==0;
    }
}