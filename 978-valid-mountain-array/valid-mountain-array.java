class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        else{
            if(arr[0]==arr[1]){
                return false;
            }
            else if(arr[0]<arr[1]){
                boolean f=true;
                for(int i=2;i<arr.length;i++){
                    
                    if(arr[i]<arr[i-1]||arr[i]==arr[i-1]){
                          f=true;
                          if(arr[i]==arr[i-1]){
                            return false;
                          } 
                          for(int j=i;j<arr.length;j++) {
                            if(arr[j]>arr[j-1]){
                                return false;
                            }
                            
                          }
                    }
                    else{
                            f=false;
                    }
                    
                    
                }
                if(!f){
                    return false;
                }
            }
            else{
                return false;
            }
            /*else{
                for(int i=2;i<arr.length;i++){
                    if(arr[i]>arr[i-1]||arr[i]==arr[i-1]){
                            if(arr[i]==arr[i-1]){
                            return false;
                          } 
                          for(int j=i;j<arr.length;j++) {
                            if(arr[j]<arr[j-1]){
                                return false;
                            }
                          }
                    }
                }
            }*/
        }
        return true;
    }
}