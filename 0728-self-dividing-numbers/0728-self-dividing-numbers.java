class Solution {
    public static boolean isNum(int num)
    {
        int temp=num;
        while(temp > 0)
        {
            int dig = temp%10;
            if(dig ==0 || num %dig !=0)
                return false;
            temp/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for(int i = left ; i<=right;i++)
        {
            if(isNum(i))
                res.add(i);
        }
        return res;
    }
}