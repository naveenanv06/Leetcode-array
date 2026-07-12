class Solution {
    public int maxDistance(int[] colors) {
        int s1=0;
        int s2=0;
        for(int i=0;i<colors.length-1;i++){
            if(colors[i]!=colors[colors.length-1]){
                s1=Math.abs(i-(colors.length-1));
                break;
            }
        }
        for(int i=colors.length-1;i>0;i--){
            if(colors[0]!=colors[i]){
                s2=Math.abs(0-i);
                break;
            }
        }
        return Math.max(s1,s2);
    }
}