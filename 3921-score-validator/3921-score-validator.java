class Solution {
    public int[] scoreValidator(String[] events) {
        int[] ans = {0, 0};

        for(String str : events)
        {
            if(ans[1] == 10)
                break;

            if(str.equals("W"))
                ans[1] += 1;
            else if(str.equals("WD") || str.equals("NB"))
                ans[0] += 1;
            else
                ans[0] += Integer.parseInt(str);
        }
        return ans;
    }
}