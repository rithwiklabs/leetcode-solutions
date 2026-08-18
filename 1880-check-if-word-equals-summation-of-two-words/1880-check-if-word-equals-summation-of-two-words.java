class Solution {
    public static int NumConvert(String word)
    {
        int res=0;
        char[] ch = word.toCharArray();
        for(char ele : ch)
            res= res *10+ (ele -'a');
        return res;
    }
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return NumConvert(firstWord)+NumConvert(secondWord) == NumConvert(targetWord);
    }
}