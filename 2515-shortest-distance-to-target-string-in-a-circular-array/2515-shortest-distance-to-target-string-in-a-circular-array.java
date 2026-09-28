class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length,ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(words[i].equals(target))
            {
                int clk=(i-startIndex+n)%n;
                int anticlk=(startIndex-i+n)%n;
                ans = Math.min(ans,Math.min(clk,anticlk));
            }
        }
        return ans==Integer.MAX_VALUE ? -1 : ans;
    }
}