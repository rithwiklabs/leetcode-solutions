class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> res = new HashSet<>();
        String[] code = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
        for(String w : words)
        {
            StringBuilder str = new StringBuilder();
            for(char ch : w.toCharArray())
            {
                str.append(code[ch - 'a']);
            }
            res.add(str.toString());
        }
        return res.size();
    }
}