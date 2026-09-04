class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res = new StringBuilder();
        for(String str : words)
        {
            int sum=0;
            for(char ch : str.toCharArray())
                sum+=weights[ch-'a'];
            int temp=(sum%26);
            res.append((char)('z'-temp));
        }
        return res.toString();
    }
}