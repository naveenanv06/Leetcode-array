class Solution {
    public String reverseWords(String s) {
        String ns="";
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                ns+=new StringBuilder(s.substring(j,i)).reverse().toString();
                ns+=" ";
                j=i+1;
            }
            

        }
        ns+=new StringBuilder(s.substring(j)).reverse().toString();
        return ns;
    }
}