class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int size=(n+k-1)/k;
        String[] str = new String[size];
        for(int i=0;i<size;i++)
        {
            StringBuilder temp = new StringBuilder();
            for(int j=0;j<k;j++)
            {
                int idx=i*k+j;
                if(idx<n)
                    temp.append(s.charAt(idx));
                else
                    temp.append(fill);
            }
            str[i]=temp.toString();
        }
        return str;
    }
}