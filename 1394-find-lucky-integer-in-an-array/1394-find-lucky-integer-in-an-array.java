class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> hash = new HashMap<>();
        for(int ele : arr)
        {
            hash.put(ele,hash.getOrDefault(ele,0)+1);
        }
        int ans=-1;
        for(Map.Entry<Integer,Integer> ety : hash.entrySet())
        {
            int num=ety.getKey();
            int freq=ety.getValue();
            if(num==freq)
                ans=Math.max(ans,num);
        }
        return ans;
    }
}