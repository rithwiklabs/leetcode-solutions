class Solution {
    public int countMonobit(int n) {
        int ans=1;
        int num=1;
        while(num<=n)
        {
            num<<=1;
            num++;
            ans++;
        }
        return ans;
    }
}