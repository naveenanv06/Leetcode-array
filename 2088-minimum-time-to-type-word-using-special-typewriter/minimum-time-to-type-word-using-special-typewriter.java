class Solution {
    private static int check(char ch){
        return ch-'a';
    }
    public int minTimeToType(String s) {
        int sum=0;
        int first = check(s.charAt(0));
        sum += Math.min(first, 26 - first);
        for(int i=1;i<s.length();i++){
            int a=check(s.charAt(i));
            int b=check(s.charAt(i-1));
            sum+=Math.min(Math.abs(a-b),26-Math.abs(a-b));

        }
        sum+=s.length();
        return sum;

    }
}