class Solution {
    public int minOperations(String[] logs) {
        int res=0;
        for(String pos : logs)
        {
            if(pos.equals("../"))
            {
                if(res>0)
                    res--;
            }
            else if(!pos.equals("./"))
                res++;
        }
        return res;
    }
}