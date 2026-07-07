class Solution {
    public int[] diStringMatch(String s) {
       int[] arr=new int[s.length()+1];
       int a=0;
       int b=s.length();
       for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='I'){
            arr[i]=a++;

         }
         else{
            arr[i]=b--;
         }
       }  
       if(s.charAt(s.length()-1)=='I')
            arr[s.length()]= a;
       else
        arr[s.length()]= b;
       return arr;
    }
}