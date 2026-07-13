class Solution {
    public String reverseStr(String s, int k) {
        String ns="";
        for(int i=0;i<s.length();i+=2*k ){
            int end=Math.min(i+k,s.length());
            ns+=new StringBuilder(s.substring(i,end)).reverse().toString();
            if(end<s.length()){
                ns+=s.substring(end,Math.min(i+2*k,s.length()));
            }
        }
        return ns;
    }
}