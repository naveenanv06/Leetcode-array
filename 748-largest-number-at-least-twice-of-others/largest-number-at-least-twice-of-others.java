import java.util.*;
class Solution {
    public int dominantIndex(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            a.put(nums[i],i);
        }
        Arrays.sort(nums);
        int n=nums[nums.length-1];
        int m=nums[nums.length-2];
        if(m*2<=n){
                return a.get(n);
        }
        else
            return -1;
    }
}