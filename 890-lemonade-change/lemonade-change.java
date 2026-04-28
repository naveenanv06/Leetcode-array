class Solution {
    public boolean lemonadeChange(int[] nums) {
         int tenc=0;
         int twenc=0;
         int fc=0;
         boolean a=true;
         for(int i=0;i<nums.length;i++){
            if(nums[i]==5){
                fc++;
            }
            else if(nums[i]==10&&fc>=1){
                fc--;
                tenc++;
                a=true;
            }
            else if(nums[i]==20){
                if(tenc>=1&&fc>=1){
                    tenc--;
                    fc--;
                    a=true;
                }
                
                else if(fc*5>=15){
                    fc-=3;
                    a=true;
                }
                else{
                    return false;
                    
                }

                
            }
            else{
                a=false;
                
            }

         }
         return a;

    }
}