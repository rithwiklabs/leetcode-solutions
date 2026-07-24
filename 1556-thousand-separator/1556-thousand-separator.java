class Solution {
    public String thousandSeparator(int n) {
        String s = Integer.toString(n);
        StringBuilder res= new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            res.append(s.charAt(i));
            count++;
            if(count==3 && i>0)
            {
                res.append('.');
                count=0;
            }
        }
        return res.reverse().toString();
    }
}