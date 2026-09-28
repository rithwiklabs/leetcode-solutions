class Solution {
    public int maxDepth(String s) {
        int dep=0,max=0;
        for(char ch : s.toCharArray())
        {
            if(ch=='(')
                dep++;
            else if(ch==')')
                dep--;
            if(dep > max)
                max=dep;
        }
        return max;
    }
}