class Solution {
    private static int check(int diff,int sum){
            while(diff>0){
                if(diff/15!=0){
                    diff-=15;
                    sum++;
                }
                else if(diff/5!=0&&diff/15==0){
                    diff-=5;
                    sum++;
                }
                else{
                    diff--;
                    sum++;
                }
            }
            return sum;
    }
    public int convertTime(String cur, String cor) {
        int a=Integer.parseInt(cur.substring(0,2));
        int b=Integer.parseInt(cur.substring(3));
        int aa=Integer.parseInt(cor.substring(0,2));
        int bb=Integer.parseInt(cor.substring(3));
        int sum=0;
        int hh=Math.abs(a-aa);
        if(b>bb){
            while(hh>1){
                sum++;
                hh--;
            }
            
            int diff=Math.abs(60-b+bb);
            return check(diff,sum);
        }
        else{
            sum+=hh;
            int diff=Math.abs(b-bb);
            return check(diff,sum);

        }
        

    
        

    }
}