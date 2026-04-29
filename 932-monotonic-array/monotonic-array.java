class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean max=false;
       boolean min=false;
       for(int i=1;i<nums.length;i++){
          if(!min&&nums[i]>=nums[i-1]){
            if(!(nums[i]==nums[i-1]))
                 max=true;
          }
          else if(!max&&nums[i]<=nums[i-1]){
            if(!(nums[i]==nums[i-1]))
                 min=true;
          }
          else{
            
            return false;
          }

       }
       
       return true; 
    }
}