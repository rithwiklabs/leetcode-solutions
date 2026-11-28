class Solution {
    public int heightChecker(int[] heights) {
        int[] exp = Arrays.copyOf(heights,heights.length);
        Arrays.sort(exp);
        int res=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=exp[i])
                res++;
        }
        return res;
    }
}