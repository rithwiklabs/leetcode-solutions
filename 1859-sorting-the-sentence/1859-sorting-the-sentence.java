class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        for(String word : str)
        {
            StringBuilder sb = new StringBuilder();
            char[] ch = word.toCharArray();
            int pos = ch[ch.length-1] - '0';
            for(int i=0;i<ch.length-1;i++)
            {
                sb.append(ch[i]);
            }
            res[pos-1]=sb.toString();
        }
        return String.join(" ",res);
    }
}