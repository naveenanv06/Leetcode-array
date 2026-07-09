import java.util.*;
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        
        
        
        for(int i=0;i<nums.length&&k>0;i++){
            if(nums[i]<0){
                 nums[i]=-1*nums[i];
                 k--;
            }
           
            
        }
        Arrays.sort(nums);
        if(k%2==1){
                    return Arrays.stream(nums).sum()-(2*nums[0]);
                }
        
        return Arrays.stream(nums).sum();
    }
}