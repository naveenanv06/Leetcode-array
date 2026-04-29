class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                temp=nums[a];
                nums[a++]=nums[i];
                nums[i]=temp;
            }
        }
        return nums;     
    }
}