class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<k;i++){
            res.append(str[i]);
            if(i<k-1)
                res.append(" ");
        }
        return res.toString();
    }
}