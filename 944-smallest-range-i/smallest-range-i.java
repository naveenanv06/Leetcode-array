import java.util.*;
class Solution {
    public int smallestRangeI(int[] nums, int k) {
            Arrays.sort(nums);
            int n_k=k*-1;
           
                int max=nums[nums.length-1]-k;
                int min=nums[0]+k;
                int diff=max-min;
                return Math.max(0,diff);

                
            
            

    }
}