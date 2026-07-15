class Solution {
    public String convertToTitle(int c) {

        StringBuilder s = new StringBuilder();
        while (c > 0) {
            c--;
            s.append((char) ('A' + (c % 26)));
            c /= 26;
        }
        return s.reverse().toString();
    }
}