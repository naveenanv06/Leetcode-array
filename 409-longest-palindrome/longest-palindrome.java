import java.util.*;

class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int sum = 0;
        boolean odd = false;

        for (int v : map.values()) {

            if (v % 2 == 0) {
                sum += v;
            } else {
                sum += v - 1;
                odd = true;
            }
        }

        if (odd)
            sum++;

        return sum;
    }
}