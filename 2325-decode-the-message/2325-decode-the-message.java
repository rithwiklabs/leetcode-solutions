class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> m = new HashMap<>();
        char currch = 'a';
        for(char ch : key.toCharArray())
        {
            if(ch!=' ' && !m.containsKey(ch))
                m.put(ch,currch++);
        }
        StringBuilder res = new StringBuilder();
        for( char ch : message.toCharArray())
        {
            if(ch==' ')
                res.append(' ');
            else
                res.append(m.get(ch));
        }
        return res.toString();
    }
}