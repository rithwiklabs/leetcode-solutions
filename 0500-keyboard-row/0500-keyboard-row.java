class Solution {
    public static boolean isChar(String s , String row)
    {
        for(char ch : s.toCharArray())
        {
            if(row.indexOf(Character.toLowerCase(ch))==-1)
                return false;
        }
        return true;
    }
    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        String firstrow="qwertyuiop";
        String secondrow="asdfghjkl";
        String thirdrow="zxcvbnm";
        for(String str : words)
        {
            if(isChar(str,firstrow)||isChar(str,secondrow)||isChar(str,thirdrow))
            {
                ans.add(str);
            }
        }
        return ans.toArray(new String[0]);
    }
}