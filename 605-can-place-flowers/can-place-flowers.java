class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        int a=fb.length;
        boolean flag=false;
         int b=fb.length-1;
        
        if(n==0){
            return true;
        } 
        if(fb.length==1){
            if(fb[0]==1)
                return false;
            else
                return true;
        }
        else{
            while(b>=0){
                if(b==0){
                    if(fb[b]==0&&fb[b+1]==0){
                        n--;
                       
                        
                        if(n==0){
                            flag=true;
                            break;
                        }
                    }
                }
                else if(b==fb.length-1){
                    if(fb[b]==0&&fb[b-1]==0){
                        fb[b]=1;
                        n--;
                        if(n==0){
                            flag=true;
                            break;
                        }
                    }
                }
                else{
                   if(fb[b]==0&&fb[b+1]==0&&fb[b-1]==0){
                        n--;
                        fb[b]=1;
                        if(n==0){
                            flag=true;
                            break;
                        }
                   }
                    
                }
                b--;
               
                 
              
              
            }
        }
        return flag;

    }
}