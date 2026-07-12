class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=s.length()-1;
        int r=t.length()-1;
        while(l>=0&&r>=0){
            if(t.charAt(r)==s.charAt(l)){
                r--;
                l--;
            }
            else
                r--;
        }
        if(l<0){
            return true;
        }
        else{
            return false;
        }
    }
}