import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]*nums[i]);
        }
        Collections.sort(l);
        for(int i=0;i<l.size();i++){
            nums[i]=l.get(i);
        }
        return nums;
    }
}