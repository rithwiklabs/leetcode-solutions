class Solution {
    public String removeStars(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*')
                st.pop();
            else
                st.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty())
            ans.append(st.pop());

        return ans.reverse().toString();
    }
}