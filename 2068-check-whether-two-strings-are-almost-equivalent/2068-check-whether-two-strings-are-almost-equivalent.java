// class Solution {
//     public boolean checkAlmostEquivalent(String word1, String word2) {
//         Map<Character,Integer> m1 = new HashMap<>();
//         Map<Character,Integer> m2 = new HashMap<>();
//         for(char ch : word1.toCharArray())
//         {
//             m1.put(ch,m1.getOrDefault(ch,0)+1);
//         }
//         for(char ch : word2.toCharArray())
//         {
//             m2.put(ch,m2.getOrDefault(ch,0)+1);
//         }
//         for(char ch = 'a'; ch<='z';ch++)
//         {
//             int c1 = m1.getOrDefault(ch,0);
//             int c2 = m2.getOrDefault(ch,0);
//             if(Math.abs(c1-c2)>3)
//                 return false;
//         }

//         return true;
//     }
// }
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<word1.length();i++)
        {
            m.put(word1.charAt(i),m.getOrDefault(word1.charAt(i),0)+1);
            m.put(word2.charAt(i),m.getOrDefault(word2.charAt(i),0)-1);
        }
        for(int i : m.values())
        {
            if( i>3 || i<-3)
                return false;
        }
        return true;
    }
}