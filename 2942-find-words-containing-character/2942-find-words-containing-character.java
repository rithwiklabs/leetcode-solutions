class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(char ch : words[i].toCharArray())
            {
                if(ch == x)
                {
                    l.add(i);
                    break; 
                }
            }
        }   
        return l;
    }
}