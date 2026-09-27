class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String word ="";
        for(String ele : words)
        {
            word+=ele.charAt(0);
        }
        return s.equals(word);
    }
}