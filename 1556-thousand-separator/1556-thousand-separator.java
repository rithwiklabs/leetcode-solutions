class Solution {
    public String thousandSeparator(int n) {
        String str = String.valueOf(n);
        StringBuilder res = new StringBuilder();
        for(int i=0;i< str.length();i++)
        {
            if(i!=0 && (str.length()-i)%3==0)
                res.append(".");
            res.append(str.charAt(i));
        }
        return res.toString();
    }
}