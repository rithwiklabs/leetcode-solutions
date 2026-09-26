class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++)
        {
            char cur = s.charAt(i);
            for(int j=i+1;j<s.length();j++)
            {
                if(cur==s.charAt(j))
                {
                    int dis=j-i-1;
                    if(dis!=distance[cur-'a'])
                        return false;
                }
            }
        }
        return true;
    }
}