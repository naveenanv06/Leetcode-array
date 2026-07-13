class Solution {
    public int[][] flipAndInvertImage(int[][] im) {
       for(int i=0;i<im.length;i++){
        
            int st=0;
            int end=im[0].length-1;
            int temp=0;
            while(st<=end){
                temp=im[i][st];
                im[i][st]=im[i][end];
                im[i][end]=temp;
                im[i][st] = 1 - im[i][st];
                if(st!=end)
                    im[i][end] = 1 - im[i][end];
                
                st++;
                end--;
            }
        
       } 
       return im;
    }
}