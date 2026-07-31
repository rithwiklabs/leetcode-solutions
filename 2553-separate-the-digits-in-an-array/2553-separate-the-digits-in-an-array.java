class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums)
        {
            String str = String.valueOf(num);
            for(char ch : str.toCharArray())
            {
                list.add(ch-'0');
            }
        }
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i] = (int)list.get(i);
        }
        return res;
    }
}