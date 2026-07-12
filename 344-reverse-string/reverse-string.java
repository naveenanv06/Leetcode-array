class Solution {
    public void reverseString(char[] s) {

        char[] ch = new StringBuilder(String.valueOf(s))
                        .reverse()
                        .toString()
                        .toCharArray();

        for (int i = 0; i < s.length; i++) {
            s[i] = ch[i];
        }
    }
}