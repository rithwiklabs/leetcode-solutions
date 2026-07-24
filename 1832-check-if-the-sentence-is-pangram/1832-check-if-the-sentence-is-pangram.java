class Solution {
    public boolean checkIfPangram(String str) {
        Set<Character> s = new HashSet<>();
        for(char ch : str.toCharArray())
        {
            s.add(ch);
        }
        return s.size()==26;
    }
}