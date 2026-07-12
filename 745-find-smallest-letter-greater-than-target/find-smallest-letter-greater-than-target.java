class Solution {
    public char nextGreatestLetter(char[] le, char t) {
       int l=0;
       int r=le.length-1;
       
       while(l<=r){
         int mid=l+(r-l)/2;
         if(le[mid]>t){
            r=mid-1;
         }
         else{
            l=mid+1;
         }
         
         
         
       }
       if(l==le.length)
             return le[0];
        return le[l];
      
    }
}