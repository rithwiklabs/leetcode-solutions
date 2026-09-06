class Solution {
    public boolean strongPasswordCheckerII(String password) {
        Set<Character> set = new HashSet<>();
        for(int i=0;i<password.length();i++)
        {
            char ch = password.charAt(i);
            if(i>0 && ch == password.charAt(i-1))
                return false;
            if(Character.isLowerCase(ch))
                set.add('l');
            else if(Character.isUpperCase(ch))
                set.add('u');
            else if(Character.isDigit(ch))
                set.add('d');
            else
                set.add('s');
        }
        return password.length()>=8 && set.size() == 4;
    }
}